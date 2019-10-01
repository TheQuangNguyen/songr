package com.code401.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String getHelloWithName(@RequestParam(required=false, defaultValue = "User") String name, Model m) {
        m.addAttribute("name", name);
        return "hello";
    }
}
