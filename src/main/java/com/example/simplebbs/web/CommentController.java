package com.example.simplebbs.web;

import com.example.simplebbs.article.CommentService;
import com.example.simplebbs.user.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/comments")
    public String writeComment(@Validated @ModelAttribute CommentInput commentInput,
                               @AuthenticationPrincipal User user,
                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "redirect:/view/" + commentInput.articleId;
        }

        commentService.writeComment(commentInput.articleId, user.getId(), user.getUsername(), commentInput.content);
        return "redirect:/view/" + commentInput.articleId;
    }
}
