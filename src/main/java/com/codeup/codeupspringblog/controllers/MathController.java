package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public String add(@PathVariable int num1, @PathVariable int num2) {
        int result = num1 + num2;
        return String.valueOf(result);
    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public String subtract(@PathVariable int num1, @PathVariable int num2) {
        int result = num2 - num1;
        return String.valueOf(result);
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public String multiply(@PathVariable int num1, @PathVariable int num2) {
        int result = num1 * num2;
        return String.valueOf(result);
    }

    @GetMapping("/division/{num1}/and/{num2}")
    @ResponseBody
    public String division(@PathVariable int num1, @PathVariable int num2) {
        int result = num1 / num2;
        return String.valueOf(result);

    }

}
