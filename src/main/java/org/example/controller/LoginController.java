package org.example.controller;

import org.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("user", new User());
        return "sign-in";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user) {
        return "sign-in"; // Или редерект на ошибку или на главнуб стр (sign-in сейчас просто так написан)
    }
}
