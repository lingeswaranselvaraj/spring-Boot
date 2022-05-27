package com.springboot.java.student;

import java.time.LocalDate;

public class student {
    private Long Id;
    private String name;
    private Integer age;
    private LocalDate dob;
    private String email;

    public student() {

    }

    public student(Long Id, String name, Integer age, LocalDate dob, String email) {
        this.Id = Id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public student(String name, Integer age, LocalDate dob, String email) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;

    }


    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
}
