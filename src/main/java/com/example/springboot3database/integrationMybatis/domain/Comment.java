package com.example.springboot3database.integrationMybatis.domain;

import org.springframework.stereotype.Component;

/**
 * @auther: 常兆海
 * @Description:
 * @DateTime: 2023/4/21 15:50
 **/
@Component
public class Comment {
    private int id;
    private String auther;
    private String content;
     private int aId;

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", auther='" + auther + '\'' +
                ", content='" + content + '\'' +
                ", aId=" + aId +
                '}';
    }

    public String getauther() {
        return auther;
    }

    public void setauther(String auther) {
        this.auther = auther;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
