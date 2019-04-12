package com.sda.springmvc.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("student")
public class Student implements Person {
    private String name;
    private long id;
    private String contactNumber;

    public Student(String name, long id, String contactNumber) {
        System.out.println("Student constructor");
        this.name = name;
        this.id = id;
        this.contactNumber = contactNumber;
    }


    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "name: " + name
                + ", id: " + id
                + ", contactNumber: " + contactNumber;
    }

    public String contribute() {
        return "Message from Student's class contribute() method, this object field values are \n" + this;
    }
}
