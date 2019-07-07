package sda.spring.springbootstart2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sda.spring.springbootstart2.Entity.Student;
import sda.spring.springbootstart2.Service.StudentService;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAll")
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(value = "/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteStudentById(@PathVariable("id") int id) {
        studentService.deleteStudentById(id);
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE) //podajemy JSONa
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping
    public void updateStudentById(@RequestBody Student student) {
        studentService.updateStudentById(student);
    }
}
