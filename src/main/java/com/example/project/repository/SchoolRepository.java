package com.example.project;

import com.example.project.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepository extends JpaRepository<School, Long> {
    List<School> findByName(String name);
    int findSchoolBy();

}