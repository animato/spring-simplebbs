package com.example.simplebbs.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SecurityController {

    @GetMapping("/accessDenied")
    public String accessDenied() {
        return "accessDenied";
    }

    @PostMapping("/accessDenied")
    public String accessDeniedPost() {
        return "accessDenied";
    }
}
