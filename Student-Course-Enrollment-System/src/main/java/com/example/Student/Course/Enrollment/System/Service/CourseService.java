package com.example.Student.Course.Enrollment.System.Service;

import com.example.Student.Course.Enrollment.System.Repository.CourseRepository;
import com.example.Student.Course.Enrollment.System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

}
