package com.example.Student.Course.Enrollment.System.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
 public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    private String phoneNumber;
    private LocalDate registrationDate;
    private boolean isDeleted = false;//A soft delete means the record is not physically removed from the database

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;
}