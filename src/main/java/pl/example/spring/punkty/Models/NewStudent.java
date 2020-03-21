package pl.example.spring.punkty.Models;

import org.springframework.stereotype.Component;


public class NewStudent {
    public final String name;
    public final String number;
    public final String grupa;

    public NewStudent(String name, String number, String grupa) {
        this.name = name;
        this.number = number;
        this.grupa = grupa;
    }
}
