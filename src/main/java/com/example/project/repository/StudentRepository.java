package com.example.project.entity;

import com.example.project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface  StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findDistinctByAge(String firstName);
    List<Student> findByAge(int age);
}
