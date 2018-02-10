package me.archetype.domain;

/**
 * @author paranoidq
 * @since 1.0.0
 */
public class User extends BaseDomain {      // mybatis二级缓存要求orm对象必须可序列化
    private String id;
    private String username;
    private String password;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
