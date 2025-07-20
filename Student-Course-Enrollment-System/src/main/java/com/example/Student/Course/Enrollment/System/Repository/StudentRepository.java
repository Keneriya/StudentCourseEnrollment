package com.example.Student.Course.Enrollment.System.Repository;

import com.example.Student.Course.Enrollment.System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);
    List<Student> findByIsDeletedFalse();//so this method filters out logically deleted students.
    List<Student> findByRegistrationDateAfter(LocalDate date);
    List<Student> findByFullNameContainingIgnoreCaseOrEmailContainingIgnoreCase(String name, String email);
}
