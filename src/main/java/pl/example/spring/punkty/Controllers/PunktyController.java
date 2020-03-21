package pl.example.spring.punkty.Controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.example.spring.punkty.Models.NewStudent;
import pl.example.spring.punkty.Models.Student;
import pl.example.spring.punkty.Services.StudentService;


import java.util.List;

@RestController
@RequestMapping("/punkty")
public class PunktyController {
    private final StudentService service;

    public PunktyController(StudentService service) {
        this.service = service;
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Student> getUsers() {
        return service.getStudents();
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes =  MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Student addUser(NewStudent student) {
        return service.addStudent(student);
    }

}
