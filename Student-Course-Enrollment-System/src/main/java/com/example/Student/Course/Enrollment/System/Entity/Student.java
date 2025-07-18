package com.example.Student.Course.Enrollment.System.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String fullName;

    @Email
    @Column(unique = true)
    private String email;

    private String phoneNumber;

    private LocalDate registrationDate;
    @ManyToMany(mappedBy = "students")
    private Set<Course> courses = new HashSet<>();

    // Getters and Setters
}
