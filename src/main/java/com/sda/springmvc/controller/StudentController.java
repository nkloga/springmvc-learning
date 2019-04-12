package com.sda.springmvc.controller;

import com.sda.springmvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class StudentController {

    @RequestMapping("/student")
    public ModelAndView getStudents() {
        ModelAndView mav = new ModelAndView("student");
        List<Student> studentForm = dbMockGenerateStudentList();
        mav.addObject("name", studentForm.get(1).getName());
        mav.addObject("stud", new Student("Raimond", 1, "55443214"));
        mav.addObject("students", dbMockGenerateStudentList());
        return mav;
    }

    private List<Student> dbMockGenerateStudentList() {
        return new ArrayList<Student>(Arrays.asList(
                new Student("Raimond", 1, "55443214"),
                new Student("Rasul", 2, "54223412"),
                new Student("Ilja", 3, "55443211"),
                new Student("Artjom", 4, "565543245")));
    }
}