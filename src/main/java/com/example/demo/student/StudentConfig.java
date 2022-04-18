package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner comandLineRunner(StudentRepository repository) {
        return args -> {
            Student Andrei = new Student("Andrei", "Andreiadamchyk@gmail.com", LocalDate.of(1992, Month.JULY, 22));

            Student Iryna = new Student("Iryna", "Irynaadamchyk@gmail.com", LocalDate.of(1990, Month.AUGUST, 17));

            repository.saveAll(List.of(Andrei, Iryna));
        };
    }
}
