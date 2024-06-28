package com.example.simplebbs.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    // 새로운 사용자 정보를 데이터베이스에 삽입하는 메소드
    @Insert("INSERT INTO user (username, password) VALUES (#{username}, #{password})")
    void insertUser(User user);
}