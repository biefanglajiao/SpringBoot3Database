package com.example.springboot3database.integrationRedis.domain;

import org.springframework.data.redis.core.index.Indexed;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/26 10:38
 **/
public class Address {
    @Indexed
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
