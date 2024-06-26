package com.example.simplebbs.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping("/write")
    public String writePage(Model model) {
        model.addAttribute("articleInput", new ArticleInput());
        return "write";
    }

    @PostMapping("/write")
    public String submitForm(@ModelAttribute ArticleInput articleInput) {
        System.out.printf("Article submitted: %s %s %s %n", articleInput.subject, articleInput.contents, articleInput.author);
        return "redirect:/write";
    }
}
