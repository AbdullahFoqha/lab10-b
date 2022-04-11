package edu.miu.cs.cs425.webapp.eregistrar.controller;


import edu.miu.cs.cs425.webapp.eregistrar.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentPageController {

    private final StudentService studentService;

    public StudentPageController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping({"/eRegistrar/students", "/eRegistrar/students/home"})
    public ModelAndView studentsHomePage() {
        var model = new ModelAndView();
        model.addObject("students", studentService.getAllStudents());
        model.setViewName("public/home/students");
        return model;
    }
}
