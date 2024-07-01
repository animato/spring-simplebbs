package com.example.simplebbs.article;

import java.time.Instant;
import java.util.Random;

public class Article {
    private static final Random RANDOM = new Random(); // ID 값 생성기, 데이터베이스 ID 가 적용되면 대체됨

    private Long id;
    private String subject;
    private String contents;
    private String author;
    private Long userId;
    private Instant createdAt;
    private Instant updatedAt;

    // 모든 필수 필드를 포함한 생성자
    public Article(String subject, String contents, String author, Long userId) {
        this.id = RANDOM.nextLong(Long.MAX_VALUE);
        this.subject = subject;
        this.contents = contents;
        this.author = author;
        this.userId = userId;
        this.createdAt = Instant.now();
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

    public Long getUserId() {
        return userId;
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
