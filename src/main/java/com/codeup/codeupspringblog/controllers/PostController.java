package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String index() {
        return "Posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String view(@PathVariable String id) {
        return "Viewing post with ID: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createForm() {
        return "Viewing the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String create() {
        // Logic for creating a new post
        return "Creating a new post";
    }
}
