package com.example.springboot3database.integrationMybatis.mapper;

import com.example.springboot3database.integrationMybatis.domain.Article;
import com.example.springboot3database.integrationMybatis.domain.Comment;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/21 16:02
 **/
@Mapper
public interface ArticleMapper {
    @Select("SELECT * FROM comment WHERE a_id = #{id}")
    public List<Comment> getCommentById(int id);
    @Select("SELECT * FROM article WHERE id = #{id}")
    public Article getArticleById(int id);

    @Select("SELECT * FROM article a WHERE id = #{id}")
    @Results(id = "comment",value = {
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "content", column = "content"),
            @Result(property = "comment", column = "a_id",many = @Many(select ="com.example.springboot3database.integrationMybatis.mapper.Mapper.getCommentsById"))
    })
    public Article getArticleAndCommentById(int id);
    @Select("SELECT a_id FROM comment WHERE a_id = #{a_id}")
    @Results({
            @Result(property = "content", column = "contents"),
    })
    public List<Comment> getCommentsById(int a_id);

    public Article selectArticle(int id);
}
