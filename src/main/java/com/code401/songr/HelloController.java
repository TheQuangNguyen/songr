package com.code401.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String getHelloWithName(@RequestParam String name, Model m) {
        if (name == null) {
            name = "User";
        }
        m.addAttribute("name", name);
        return "hello";
    }
}
