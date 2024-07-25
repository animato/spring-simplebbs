package com.example.simplebbs.article;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // 쿼리를 XML에 적용하더라도 @Mapper 어노테이션이 없으면 안됨
public interface ArticleMapper {
    void insertArticle(Article article);

    List<Article> getAllArticles();

    Article getArticleById(Long id);

    void updateArticle(Long id, String subject, String contents);

    void deleteArticle(Long id);
}

