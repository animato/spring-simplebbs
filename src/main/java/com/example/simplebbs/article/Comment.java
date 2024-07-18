package com.example.simplebbs.article;

import java.time.LocalDateTime;
import java.util.Objects;

public class Comment {
    private Long id;
    private Long articleId;
    private Long userId;
    private String author;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Comment(Long articleId, Long userId, String author, String content) {
        this.articleId = articleId;
        this.userId = userId;
        this.author = author;
        this.content = content;
    }

    public boolean isAuthor(Long userId) {
        return Objects.equals(this.userId, userId);
    }

    public Long getId() {
        return id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public Long getUserId() {
        return userId;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}