package me.archetype.security.authenticate;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * @author paranoidq
 * @since 1.0.0
 */

@Service
public class AuthenticateService {


    public void login() {

    }

    public void logout() {

    }

    /**
     * 获取当前登录用户的用户名
     * @return
     */
    public String getLoginUser() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }


}
