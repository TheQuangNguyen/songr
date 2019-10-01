package com.code401.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CapitalizeController {

    @GetMapping("/capitalize/{word}")
    public String getCapitalizeWord(@PathVariable String word, Model m) {
        word = word.toUpperCase();
        m.addAttribute("word", word);
        return "capitalize";
    }

}
