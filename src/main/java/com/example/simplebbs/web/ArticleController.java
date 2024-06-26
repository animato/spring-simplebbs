package com.example.simplebbs.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @GetMapping("/write")
    public String writePage() {
        return "write";
    }
}
