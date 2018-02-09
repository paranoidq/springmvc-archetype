package me.archetype.domain;

import java.io.Serializable;

/**
 * @author paranoidq
 * @since 1.0.0
 */
public class User extends BaseDomain {      // mybatis二级缓存要求orm对象必须可序列化
    private String id;
    private String name;
    private String password;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
