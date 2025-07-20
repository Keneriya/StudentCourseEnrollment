package com.example.Student.Course.Enrollment.System.Service;

import com.example.Student.Course.Enrollment.System.Repository.CourseRepository;
import com.example.Student.Course.Enrollment.System.Repository.EnrollmentRepository;
import com.example.Student.Course.Enrollment.System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository enrollmentRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;
}
