package com.sda.springmvc.controller;

import com.sda.springmvc.model.Person;
import com.sda.springmvc.model.Student;
import com.sda.springmvc.model.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClassController {

    @Autowired
    private University university;

    @Autowired
    @Qualifier("student")
    private Person person;

    @RequestMapping("/classes")
    public ModelAndView getClassList() {
        Student stud = (Student) person;
        stud.setName("StudentName");
        stud.setId(12);
        stud.setContactNumber("43212312");
        university.setPersonData("Artjom", 323, "43214123");
        ModelAndView mav = new ModelAndView("class");
        mav.addObject("act", university.startLesson());
        mav.addObject("person", person.contribute());
        return mav;
    }

    @RequestMapping("/equipment")
    public String getEquipment() {
        return "equipment";
    }
}