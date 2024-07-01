package com.example.simplebbs.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    // 새로운 사용자 정보를 데이터베이스에 삽입하는 메소드
    @Insert("INSERT INTO user (username, password) VALUES (#{username}, #{password})")
    void insertUser(User user);

    // 사용자 이름을 매개변수로 받아 해당 사용자의 정보를 불러오는 메소드
    @Select("SELECT * FROM user WHERE username = #{username}")
    User getUser(String username);
}