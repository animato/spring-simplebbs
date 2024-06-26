package com.example.simplebbs.article;

import java.time.Instant;

public class Article {
    private Long id;
    private String subject;
    private String contents;
    private String author;
    private Instant createdAt;
    private Instant updatedAt;

    // 기본 생성자
    public Article() {
    }

    // 모든 필수 필드를 포함한 생성자
    public Article(Long id, String subject, String contents, String author, Instant createdAt) {
        this.id = id;
        this.subject = subject;
        this.contents = contents;
        this.author = author;
        this.createdAt = createdAt;
    }

    // Getter 메서드
    public Long getId() {
        return id;
    }
    
    public String getSubject() {
        return subject;
    }

    public String getContents() {
        return contents;
    }

    public String getAuthor() {
        return author;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return "Article{" +
                "subject='" + subject + '\'' +
                ", contents='" + contents + '\'' +
                ", author='" + author + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", id=" + id +
                '}';
    }
}
