package com.example.simplebbs.article;

import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    public void writeArticle(String subject, String contents, String author) {
        // 입력 받은 데이터를 가지고 Article 객체를 생성
        Article article = new Article(subject, contents, author);

        // 생성된 Article 객체를 데이터베이스에 저장
        System.out.println(article);
    }
}
