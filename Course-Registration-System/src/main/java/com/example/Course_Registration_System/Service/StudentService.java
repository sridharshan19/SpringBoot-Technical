package com.example.Course_Registration_System.Service;

import com.example.Course_Registration_System.Dto.StudentRegistrationDTO;
import com.example.Course_Registration_System.Entity.Course;
import com.example.Course_Registration_System.Entity.Student;
import com.example.Course_Registration_System.Repository.CourseRepository;
import com.example.Course_Registration_System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    // Register student with seat limit check
    public Student registerStudent(StudentRegistrationDTO dto) {

        Course course = courseRepository.findById(dto.getCourseId())
                .orElseThrow(() -> new RuntimeException("Course not found"));


        if (course.getStudents().size() >= course.getMaxSeats()) {
            throw new RuntimeException("No seats available for this course");
        }

        Student student = new Student();
        student.setStudentName(dto.getStudentName());
        student.setEmail(dto.getEmail());
        student.setMobile(dto.getMobile());
        student.setCourse(course);

        return studentRepository.save(student);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
