package com.example.Student.Course.Enrollment.System.Repository;

import com.example.Student.Course.Enrollment.System.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query("SELECT c FROM Course c WHERE SIZE(c.students) >= :min")
    List<Course> findByMinEnrolledStudents(@Param("min") int min);
}
