package com.example.Student.Course.Enrollment.System.Repository;

import com.example.Student.Course.Enrollment.System.Entity.Course;
import com.example.Student.Course.Enrollment.System.Entity.Enrollment;
import com.example.Student.Course.Enrollment.System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    boolean existsByStudentAndCourse(Student student, Course course);
    List<Enrollment> findByStudentId(Long studentId);
    List<Enrollment> findByCourseId(Long courseId);
}
