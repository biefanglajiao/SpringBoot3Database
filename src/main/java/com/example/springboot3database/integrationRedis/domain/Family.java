package com.example.springboot3database.integrationRedis.domain;

import org.springframework.data.redis.core.index.Indexed;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/26 10:38
 **/
public class Family {
    @Indexed
    private String type;

    @Indexed
    private String username;

    @Override
    public String toString() {
        return "Family{" +
                "type='" + type + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
