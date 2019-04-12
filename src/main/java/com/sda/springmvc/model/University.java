package com.sda.springmvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class University {

//    @Autowired
//    @Qualifier("teacher")
    private Person person;

   @Autowired
   @Qualifier("teacher")
   public void setPerson(Person person){
        this.person = person;
    }

    public Person getPerson(){
        return person;
    }

    public String startLesson(){
        return person.contribute();
    }

    public void setPersonData(String name, long id, String number){
        Teacher pers = (Teacher) person;
        pers.setName(name);
        pers.setId(id);
        pers.setContactNumber(number);
    }
}
