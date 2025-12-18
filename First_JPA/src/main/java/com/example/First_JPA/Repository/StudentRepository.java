package com.example.First_JPA.Repository;

import com.example.First_JPA.Model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentModel,Integer> {

    List<StudentModel> findByTechnology(String technology);
    @Query(
            value = "SELECT * FROM student_model WHERE age = :age AND technology = :technology",
            nativeQuery = true
    )
    List<StudentModel> findByTechnologyAndAge(@Param("age") int age,
                                              @Param("technology") String technology);


}
