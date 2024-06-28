package com.example.simplebbs.web;

import com.example.simplebbs.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("userInput", new UserInput());
        return "user/register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute UserInput userInput) {
        userService.joinUser(userInput.getUsername(), userInput.getPassword());
        return "redirect:/login";
    }
}