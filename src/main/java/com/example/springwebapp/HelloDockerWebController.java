package com.example.springwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloDockerWebController {

    @GetMapping("/")
    public String homePage() {
        return "template"; // This needs to be the html page name
    }

    @GetMapping("/{name}")
    public String homePageParamenter(@PathVariable(name="name") String name, Model model) {
        model.addAttribute("name", name);
        return "template2"; // This needs to be the html page name
    }
}
