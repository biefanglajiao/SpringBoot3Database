package com.example.springboot3database.integrationMybatis.service;

import com.example.springboot3database.integrationMybatis.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/21 17:01
 **/
@Service
public class ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    public void test(){
        System.out.println(articleMapper.getArticleById(1));
        System.out.println(articleMapper.getCommentById(1));
    }
}
