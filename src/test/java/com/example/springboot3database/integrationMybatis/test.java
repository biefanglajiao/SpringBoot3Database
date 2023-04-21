package com.example.springboot3database.integrationMybatis;

import com.example.springboot3database.integrationMybatis.domain.Article;
import com.example.springboot3database.integrationMybatis.mapper.ArticleMapper;
import com.example.springboot3database.integrationMybatis.service.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/21 16:11
 **/
@SpringBootTest
public class test {
    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void test() {
        articleMapper.getArticleById(1);
        System.out.println(articleMapper.getArticleById(1));
    }

    @Autowired
    private ArticleService articleService;

    @Test
    public void test2() {
        articleService.test();
    }


    @Test
    public void test3() {
        System.out.println(articleMapper.getArticleAndCommentById(1));
    }

    /**
     * @方法描述： 使用xml写的一对多
     */
    @Test
    public void test4() {
        Article article = articleMapper.selectArticle(1);
        System.out.println(article);
    }
}
