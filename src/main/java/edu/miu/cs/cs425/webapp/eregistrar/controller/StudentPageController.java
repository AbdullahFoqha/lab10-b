package edu.miu.cs.cs425.webapp.eregistrar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentPageController {

    @GetMapping({"/eRegistrar/students", "/eRegistrar/students/home"})
    public String studentsHomePage() {
        return "public/home/students";
    }
}
