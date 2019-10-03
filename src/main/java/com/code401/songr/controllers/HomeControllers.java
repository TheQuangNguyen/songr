package com.code401.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeControllers {

    @GetMapping("/")
    public String getHomePage() {
        return "home";
    }

    @GetMapping("/capitalize/{word}")
    public String getCapitalizeWord(@PathVariable String word, Model m) {
        word = word.toUpperCase();
        m.addAttribute("word", word);
        return "capitalize";
    }

    @GetMapping("/hello")
    public String getHelloWithName(@RequestParam(required=false, defaultValue = "User") String name, Model m) {
        m.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/error")
    public String getErrorPage() {
        return "error";
    }
}
