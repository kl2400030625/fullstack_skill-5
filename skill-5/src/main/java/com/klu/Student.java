package com.klu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id = 14;
    private String name = "Bhavesh";
    private String gender = "Male";

    @Autowired
    private Certification certification;

    public void showStudent() {

        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Gender: " + gender);

        certification.showCertification();
    }
}
