package com.example.simplebbs.article;

import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    private final ArticleMapper articleMapper;

    public ArticleService(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    public void writeArticle(String subject, String contents, String author) {
        Article article = new Article(subject, contents, author);
        articleMapper.insertArticle(article);
    }
}
