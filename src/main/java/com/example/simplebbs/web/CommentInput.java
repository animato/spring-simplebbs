package com.example.simplebbs.web;

import jakarta.validation.constraints.NotBlank;

public class CommentInput {

    Long articleId;

    @NotBlank(message = "내용은 필수 입력 항목입니다.") // 내용은 반드시 입력해야 함
    String content;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
