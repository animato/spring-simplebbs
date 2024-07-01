package com.example.simplebbs.article;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleMapper {
    // SQL 쿼리와 매핑할 메서드를 정의
    @Insert("INSERT INTO article (subject, contents, author, user_id) VALUES (#{subject}, #{contents}, #{author}, #{userId})")
    void insertArticle(Article article);

    @Select("SELECT * FROM article")
    List<Article> getAllArticles();

    @Select("SELECT * FROM article WHERE id = #{id}")
    Article getArticleById(Long id);
}

