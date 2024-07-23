package com.example.simplebbs.article;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ArticleMapper {
    // SQL 쿼리와 매핑할 메서드를 정의
    @Insert("""
            INSERT INTO article (subject, contents, author, user_id)
            VALUES (#{subject}, #{contents}, #{author}, #{userId})
            """)
    void insertArticle(Article article);

    @Select("SELECT * FROM article")
    List<Article> getAllArticles();

//    @Select("SELECT * FROM article WHERE id = #{id}")
//    Article getArticleById(Long id);

    @Update("UPDATE article SET subject = #{subject}, contents = #{contents} WHERE id = #{id}")
    void updateArticle(Long id, String subject, String contents);

    @Delete("DELETE FROM article WHERE id = #{id}")
    void deleteArticle(Long id);

    //    @Select("""
//            SELECT * FROM article
//            WHERE id = #{id}
//            """)
//    @Results({
//            @Result(property = "id", column = "id"),
//            @Result(property = "comments", column = "id", many = @Many(select = "selectCommentsByArticleId"))
//    })
    Article getArticleById(Long id);

    //    @Select("""
//            SELECT * FROM comment
//            WHERE article_id = #{articleId}
//            """)
    List<Comment> selectCommentsByArticleId(Long articleId);

    @Select("""
            SELECT a.*, COUNT(c.id) as comment_count
            FROM article a
            LEFT JOIN comment c ON a.id = c.article_id
            GROUP BY a.id
            """)
    List<Article> getArticlesWithCommentCount();
}

