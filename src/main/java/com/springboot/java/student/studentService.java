package com.springboot.java.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class studentService {
    
    public static List<student> getStudents() {
    System.out.println("Test link");
        return List.of(new student(
                (long) 1,
                "link",
                33,
                LocalDate.of(1990, 12, 3),
                "as@gmail.com"));
}
}
 