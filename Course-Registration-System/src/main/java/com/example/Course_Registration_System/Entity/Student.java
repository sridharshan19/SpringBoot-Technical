package com.example.Course_Registration_System.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;


    private String studentName;
    private String email;
    private String mobile;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
