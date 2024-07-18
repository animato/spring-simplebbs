package com.example.simplebbs.article;

import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentMapper commentMapper;

    public CommentService(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    public void writeComment(Long articleId, Long userId, String author, String content) {
        Comment comment = new Comment(articleId, userId, author, content);
        commentMapper.insertComment(comment);
    }
}