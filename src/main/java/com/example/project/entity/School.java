package com.example.project;

import com.example.project.entity.Student;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Data
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int numberOfStudents;
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Student> students;
}
