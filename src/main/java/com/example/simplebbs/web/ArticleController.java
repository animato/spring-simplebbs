package com.example.simplebbs.web;

import com.example.simplebbs.article.Article;
import com.example.simplebbs.article.ArticleService;
import com.example.simplebbs.user.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService){
        this.articleService = articleService;
    }

    @GetMapping("/write")
    public String writePage(Model model) {
        model.addAttribute("articleInput", new ArticleInput());
        return "write";
    }

    @PostMapping("/write")
    public String submitForm(@Validated @ModelAttribute ArticleInput articleInput,
                             BindingResult bindingResult,
                             @AuthenticationPrincipal User user) {
        if (bindingResult.hasErrors()) {
            return "write";
        }

        // ArticleService의 writeArticle 메소드 호출
        articleService.writeArticle(articleInput.getSubject(), articleInput.getContents(), user.getUsername(), user.getId());

        return "redirect:/";
    }

    @GetMapping("/")
    public String list(Model model) {
        List<Article> articles = articleService.getAllArticles();
        model.addAttribute("articles", articles);
        return "list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") Long id, Model model) {
        Article article = articleService.getArticleById(id);
        model.addAttribute("article", article);
        return "view";
    }
}
