package com.example.springboot3database.缓存_JPA.domain;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/26 9:47
 **/
@Component
@Entity(name = "t_discussCache")
public class DiscussCache  implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "DiscussCache{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

}
