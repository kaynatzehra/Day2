package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller

public class HelloWebController {

    @GetMapping("/kz")
    public String HelloWorld() {
        return "Hello World";
    }

    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("message","All well that ends well");
        return "message";
    }
}
