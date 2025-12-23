package com.example.Course_Registration_System.Repository;

import com.example.Course_Registration_System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
