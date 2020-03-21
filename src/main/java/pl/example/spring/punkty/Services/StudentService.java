package pl.example.spring.punkty.Services;


import org.springframework.stereotype.Service;
import pl.example.spring.punkty.Models.NewStudent;
import pl.example.spring.punkty.Models.Student;
import pl.example.spring.punkty.Models.StudentROw;
import pl.example.spring.punkty.Models.StudentRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }


    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        repository.findAll().forEach(studentROw -> students.add( mapStudent(studentROw)));
        return students;
    }

    public Student addStudent(NewStudent student) {
        StudentROw save = this.repository.save(new StudentROw(student.name, student.number, student.grupa));
        return mapStudent(save);
    }

    private Student mapStudent(StudentROw studentROw) {
        return new Student(
                studentROw.getId(),
                studentROw.getName(),
                studentROw.getNumber(),
                studentROw.getGrupa());
    }
}
