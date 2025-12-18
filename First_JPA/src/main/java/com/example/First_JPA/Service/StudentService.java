package com.example.First_JPA.Service;

import com.example.First_JPA.Model.StudentModel;
import com.example.First_JPA.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // GET all students
    public List<StudentModel> getStudents() {
        return studentRepository.findAll();
    }

    // ADD student
    public void addAllStudents(List<StudentModel> students) {
        studentRepository.saveAll(students);
    }

    // UPDATE student
    public void updateStudent(StudentModel student) {
        studentRepository.save(student);
    }
    // DELETE student by ID
    public void deleteStudent(int rollNo) {
        if (!studentRepository.existsById(rollNo)) {
            throw new RuntimeException("Student not found");
        }

        studentRepository.deleteById(rollNo);
    }
    // GET student by ID
    public  StudentModel getStudentByID(int rollNo) {
        return studentRepository.findById(rollNo)
                .orElse(new StudentModel());
    }
    // UPDATE student by ID
    public StudentModel updateStudentID(int rollNo, StudentModel updatedstudent) {
        StudentModel existingStudent = studentRepository.findById(rollNo)
                .orElseThrow(()-> new RuntimeException("Student not found"));
        existingStudent.setAge(updatedstudent.getAge());
        existingStudent.setName(updatedstudent.getName());
        existingStudent.setTechnology(updatedstudent.getTechnology());
        return studentRepository.save(existingStudent);

    }

    // DELETE ALL Student
    public void deleteAllStudents() {
        studentRepository.deleteAll();
    }

    public List<StudentModel> getStudentByTechnology(String tech) {
        return studentRepository.findByTechnology(tech);
    }

    public List<StudentModel> getStudentByTechnologyAndAge(int age, String technology) {
        return studentRepository.findByTechnologyAndAge(age,technology);
    }
}
