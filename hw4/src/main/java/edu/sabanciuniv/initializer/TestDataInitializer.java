
package edu.sabanciuniv.initializer;

import edu.sabanciuniv.model.*;
import edu.sabanciuniv.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Month;

@Component
@RequiredArgsConstructor
@Slf4j
public class TestDataInitializer implements CommandLineRunner {

    private final StudentRepository studentRepository;


    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Student student1 = new Student(
                "Duhan Ugurlu", LocalDate.of(1997, Month.JULY,06)
                ,"Ankara","Male");
        Student student2 = new Student(
                "Imgesu Usta", LocalDate.of(1996, Month.JULY,19)
                , "Ankara","Female");
        Student student3 = new Student(
                "test test", LocalDate.of(1998, Month.DECEMBER,23)
                , "Barcelona","Female");

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);

    }
}