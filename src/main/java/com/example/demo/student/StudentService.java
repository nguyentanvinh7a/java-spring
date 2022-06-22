package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
            return List.of(
                    new Student(18120650L,
                            "Nguyen Tan Vinh",
                            "nguyentanvinh2911@gmail.com",
                            LocalDate.of(2000, Month.NOVEMBER, 29),
                            21));
    }
}
