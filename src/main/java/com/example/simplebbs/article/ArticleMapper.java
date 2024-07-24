package com.example.simplebbs.article;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    void insertArticle(Article article);

    List<Article> getAllArticles();

    Article getArticleById(Long id);

    void updateArticle(Long id, String subject, String contents);

    void deleteArticle(Long id);
}

