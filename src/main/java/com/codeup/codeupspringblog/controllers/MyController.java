package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/myPage")
    public String myPage(@RequestParam("title") String title, Model model) {
        model.addAttribute("title", title);
        return "myPage";
    }
}
