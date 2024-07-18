package com.example.simplebbs.article;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
    @Insert("""
              INSERT INTO comment (content, author, article_id, user_id) 
              VALUES (#{content}, #{author}, #{articleId}, #{user_id})
            """)
    void insertComment(Comment comment);
}