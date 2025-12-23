package com.example.Course_Registration_System.Repository;

import com.example.Course_Registration_System.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CourseRepository extends JpaRepository<Course, Integer> {
}

