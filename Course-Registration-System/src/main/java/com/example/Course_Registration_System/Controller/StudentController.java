package com.example.Course_Registration_System.Controller;

import com.example.Course_Registration_System.Dto.StudentRegistrationDTO;
import com.example.Course_Registration_System.Entity.Student;
import com.example.Course_Registration_System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public Student registerStudent(@RequestBody StudentRegistrationDTO dto) {
        System.out.println("DTO received: " + dto);
        return studentService.registerStudent(dto);
    }


    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
