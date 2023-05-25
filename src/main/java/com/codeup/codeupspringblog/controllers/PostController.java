package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    @GetMapping("/posts")
    public String index(Model model) {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("First post", "This is the body of the first post"));
        posts.add(new Post("Second post", "This is the body of the second post"));
        model.addAttribute("posts", posts);
        return "home";
    }

    @GetMapping("/posts/{id}")
    public String view(@PathVariable String id, Model model) {
        Post post = new Post("Post with ID: " + id, "This is the body of the post with ID: " + id);
        model.addAttribute("post", post);
        return "show";
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

