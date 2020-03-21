package pl.example.spring.punkty.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentROw {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    public  String name;
    public  String number;
    public  String grupa;

    protected StudentROw(){}

    public StudentROw(String name, String number, String grupa) {
        this.name = name;
        this.number = number;
        this.grupa = grupa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }
}
