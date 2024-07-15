package com.example.simplebbs.article;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private final ArticleMapper articleMapper;

    public ArticleService(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    public void writeArticle(String subject, String contents, String author, Long userId) {
        Article article = new Article(subject, contents, author, userId);
        articleMapper.insertArticle(article);
    }

    public List<Article> getAllArticles() {
        return articleMapper.getAllArticles();
    }

    public Article getArticleById(Long id) {
        return articleMapper.getArticleById(id);
    }

    public void updateArticle(Long id, String subject, String contents, Long userId) {
        Article article = articleMapper.getArticleById(id);

        if (article == null || !article.getUserId().equals(userId)) {
            throw new IllegalStateException("글을 수정할 수 없습니다.");
        }
        articleMapper.updateArticle(id, subject, contents);
    }

    public void deleteArticle(Long id, Long userId) {
        Article article = articleMapper.getArticleById(id);

        if (article == null || !article.getUserId().equals(userId)) {
            throw new IllegalStateException("글을 삭제할 수 없습니다.");
        }
        articleMapper.deleteArticle(id);
    }
}
