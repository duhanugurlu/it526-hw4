package edu.sabanciuniv.service;

import edu.sabanciuniv.model.Student;
import edu.sabanciuniv.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;


    public Student addNewStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public Student updateExistingStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteExistingStudent(Student student) {
        studentRepository.delete(student);
    }

    public List<Student> findStudentById(Integer studentId) {
        return (List<Student>) studentRepository.findStudentById(studentId);
    }
}
