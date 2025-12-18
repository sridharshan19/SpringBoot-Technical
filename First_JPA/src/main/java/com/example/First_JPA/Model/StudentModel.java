package com.example.First_JPA.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "student_model")
public class StudentModel {
    @Id
    private int rollNo;

    private int age;
    private String name;
    private String technology;
}
