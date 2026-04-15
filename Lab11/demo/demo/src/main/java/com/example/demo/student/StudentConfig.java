package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    11,
                    "Marina@gmail.com",
                    LocalDate.of(2002,1,1)
            );

            Student alex = new Student(
                    "Alex",
                    21,
                    "alex@gmail.com",
                    LocalDate.of(2002,3,10)
            );

            repository.save(mariam);
            repository.save(alex);

        };
    };
}
