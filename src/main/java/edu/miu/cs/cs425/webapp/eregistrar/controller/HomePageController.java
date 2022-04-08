package edu.miu.cs.cs425.webapp.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = {"/", "/eRegistrar", "/eRegistrar/home"})
    public String displayHomePage() {
        return "public/home/index";
    }

    @GetMapping(value = {"eRegistrar/about"})
    public String displayAboutPage() {
        return "public/home/about";
    }
}
