package com.example.CrudDemo.Controller;

import com.example.CrudDemo.Model.StudentModel;
import com.example.CrudDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/Student")
    public List<StudentModel> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/Student/{roll_no}")
    public StudentModel getStudentByRollno(@PathVariable("roll_no") int roll_no){
        return studentService.getStudentByRollno(roll_no);
    }

    @PostMapping("/Student")
    public String setStudents(@RequestBody StudentModel student){
        return studentService.setStudent(student);
    }
    @PutMapping("/Student/{roll_no}")
    public String updateStudents(@PathVariable int roll_no,@RequestBody StudentModel student){
        return studentService.updateStudent(roll_no,student);
    }

    @DeleteMapping("/Student/{roll_no}")
    public String DeleteStudent(@PathVariable int roll_no){
        return studentService.deleteStudent(roll_no);
    }



}
