package com.example.springboot3database.上传与下载.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

import org.springframework.stereotype.Component;


import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/5/1 11:03
 **/
@Component
@Entity(name = "t_filters")
public class Filters {
    @Override
    public String toString() {
        return "Filters{" +
                "id='" + id + '\'' +
                ", filter=" + Arrays.toString(filter) +
                '}';
    }

    public byte[] getFilter() {
        return filter;
    }

    public void setFilter(byte[] filter) {
        this.filter = filter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    private String id;

    @Lob
    private byte[] filter;
}
