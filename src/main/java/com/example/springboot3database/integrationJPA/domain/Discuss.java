package com.example.springboot3database.integrationJPA.domain;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/26 9:47
 **/
@Component
@Entity(name = "t_discuss")
public class Discuss {
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
        return "Discuss{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
