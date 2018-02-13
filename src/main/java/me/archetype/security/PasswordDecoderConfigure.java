package me.archetype.security;

import me.archetype.common.AppConstants;
import me.archetype.exception.InitializeException;
import me.archetype.util.EncodingUtil;
import me.archetype.util.security.DesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PlaceholderConfigurerSupport;

import java.security.Key;
import java.util.Properties;

/**
 * @author paranoidq
 * @since 1.0.0
 */
public class PasswordDecoderConfigure extends PlaceholderConfigurerSupport {

    private static final Logger logger = LoggerFactory.getLogger(PasswordDecoderConfigure.class);

    @Override
    protected void processProperties(ConfigurableListableBeanFactory configurableListableBeanFactory, Properties properties) throws BeansException {
        String encryptedPassword = (String) properties.get(AppConstants.JDBC_DATASOURCE_PASSWORD_KEY);
        String rawPassword = decPassword(encryptedPassword);
        logger.debug("成功解密JDBC密码, {}", rawPassword);
        properties.setProperty(AppConstants.JDBC_DATASOURCE_PASSWORD_KEY, rawPassword);
    }


    public static String encPassword(String rawPassword) {
        try {
            Key key = DesUtil.loadKey(AppConstants.JDBC_DATASOURCE_PASSWORD_ENC_DES_KEY.getBytes());
            byte[] encrypted = DesUtil.encrypt(rawPassword.getBytes(), key);
            return EncodingUtil.byteArray2Hex(encrypted);
        } catch (Exception e) {
            throw new InitializeException("Encrypt JDBC password error: DES", e);
        }
    }

    public static String decPassword(String encryptedPassword) {
        try {
            Key key = DesUtil.loadKey(AppConstants.JDBC_DATASOURCE_PASSWORD_ENC_DES_KEY.getBytes());
            byte[] decrypted = DesUtil.decrypt(EncodingUtil.hex2ByteArray(encryptedPassword), key);
            return new String(decrypted);
        } catch (Exception e) {
            throw new InitializeException("Decrypted JDBC password error: DES", e);
        }
    }


    public static void main(String[] args) {
        String enc = encPassword("88863650qw");
        System.out.println(enc);
        String dec = decPassword(enc);
        System.out.println(dec);

    }



}
