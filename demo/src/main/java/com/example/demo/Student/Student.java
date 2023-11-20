package com.example.demo.Student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private long id;
    private String name;
    @Transient //calculate the age by itself
    private  Integer age;
    private LocalDate DOB;
    private String email;

    public Student() {
    }

    public Student(long id, String name, LocalDate DOB, String email) {
        this.id = id;
        this.name = name;

        this.DOB = DOB;
        this.email = email;
    }

    public Student(String name, LocalDate DOB, String email) {
        this.name = name;

        this.DOB = DOB;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return Period.between(this.DOB ,LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", DOB=" + DOB +
                ", email='" + email + '\'' +
                '}';
    }
}
