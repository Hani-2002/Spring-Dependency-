package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
            Student Hani =new Student(
                    1L,
                    "Hani",

                    LocalDate.of(2000, Month.JANUARY,5),
                    "hanijarrah20@gmail.com"
            );

            Student Osama =new Student(
                    2L,
                    "Osama",

                    LocalDate.of(2002, Month.JANUARY,5),
                    "osamazayed@gmail.com"
            );

            repository.saveAll(
                    List.of(Hani , Osama)
            );
        };
    }
}
