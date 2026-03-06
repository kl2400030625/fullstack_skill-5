package com.klu;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id = 501;
    private String name = "Spring Boot Course";
    private String dateOfCompletion = "15-02-2026";

    public void showCertification() {
        System.out.println("Certification ID: " + id);
        System.out.println("Certification Name: " + name);
        System.out.println("Completion Date: " + dateOfCompletion);
    }
}
