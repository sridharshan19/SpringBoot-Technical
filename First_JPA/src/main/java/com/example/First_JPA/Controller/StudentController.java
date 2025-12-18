
package com.example.First_JPA.Controller;

import com.example.First_JPA.Model.StudentModel;
import com.example.First_JPA.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<StudentModel> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public String addStudents(@RequestBody List<StudentModel> student) {
        studentService.addAllStudents(student);
        return "Students Added Successfully";
    }

    @PutMapping
    public String updateStudent(@RequestBody StudentModel student){
        studentService.updateStudent(student);
        return "Upadated successfully";
    }
    @DeleteMapping("/clear")
    public String deleteAllStudents() {
        studentService.deleteAllStudents();
        return "All students are deleted successfully...";
    }


    @DeleteMapping("/{roll_no}")
    public String deleteStudent(@PathVariable int roll_no){
        studentService.deleteStudent(roll_no);
        return "Student deleted Successfully";
    }

    @GetMapping("/{roll_no}")
    public StudentModel getStudentById(@PathVariable("roll_no") int roll_no){
        return studentService.getStudentByID(roll_no);
    }
    @PutMapping("/{roll_no}")
    public StudentModel updateStudent(@PathVariable int roll_no,@RequestBody StudentModel student){
        return studentService.updateStudentID(roll_no,student);
    }
    @GetMapping("/technology/{tech}")
    public List<StudentModel> getStudentByTechnology(@PathVariable("tech") String tech) {
        return studentService.getStudentByTechnology(tech);
    }
    @PostMapping("/filters")
    public List<StudentModel> getStudentByTechnologyAndAge(@Param("age") int age,
                                                          @Param("technology") String technology){
        return studentService.getStudentByTechnologyAndAge(age,technology);
    }


}

