package pl.example.spring.punkty.Models;

import org.springframework.stereotype.Component;


public class Student {
    public final Long id;
    public final String name;
    public final String number;
    public final String grupa;

    public Student(Long id, String name, String number, String grupa) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.grupa = grupa;
    }
}
