package com.springboot.java.student;

import java.time.LocalDate;
import java.util.List;
import com.springboot.java.student.studentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
public class studentController {

    private final studentService StudentService;

    @Autowired
    public studentController(studentService StudentService) {
        this.StudentService = StudentService;
    }

    

    @GetMapping
    public List<student> getStudent() {
        return studentService.getStudents();
    }

}
