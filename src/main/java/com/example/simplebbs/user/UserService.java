package com.example.simplebbs.user;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
        this.passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    public void joinUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        userMapper.insertUser(user);
    }
}