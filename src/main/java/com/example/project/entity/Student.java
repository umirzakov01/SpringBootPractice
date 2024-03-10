package com.example.project;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int grade;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;
}
