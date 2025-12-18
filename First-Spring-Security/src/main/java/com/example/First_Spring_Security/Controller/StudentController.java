package com.example.First_Spring_Security.Controller;

import com.example.First_Spring_Security.Model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "Sridharshan", "Spring Boot"),
                    new Student(2, "Arun", "Java"),
                    new Student(3, "Karthik", "React")
            )
    );

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getcsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public String addStudent(@RequestBody Student stu) {
        students.add(stu);
        return "Student added successfully";
    }
}
