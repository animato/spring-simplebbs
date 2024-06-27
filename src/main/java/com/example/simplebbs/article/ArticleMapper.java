package com.example.simplebbs.article;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {
    // SQL 쿼리와 매핑할 메서드를 정의
    @Insert("INSERT INTO article (subject, contents, author) VALUES (#{subject}, #{contents}, #{author})")
    void insertArticle(Article article);
}

