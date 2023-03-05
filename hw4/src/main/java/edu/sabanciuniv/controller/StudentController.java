package edu.sabanciuniv.controller;

import edu.sabanciuniv.model.Student;
import edu.sabanciuniv.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping("/student")
    public Student addNewStudent(@RequestBody Student student){
        return studentService.addNewStudent(student);
    }

    @PutMapping("/student")
    public Student updateExistingStudent(@RequestBody Student student){
        return studentService.updateExistingStudent(student);
    }

    @DeleteMapping("/student")
    public void deleteExistingStudent(@RequestBody Student student){
        studentService.deleteExistingStudent(student);
    }

    @GetMapping("/student/{studentId}")
    public List<Student> getAllStudentIdofStudent(@PathVariable Integer studentId ){
        return studentService.findStudentById(studentId);
    }

}
