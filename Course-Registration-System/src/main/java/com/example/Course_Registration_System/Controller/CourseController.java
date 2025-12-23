package com.example.Course_Registration_System.Controller;

import com.example.Course_Registration_System.Dto.CourseAvailabilityDTO;
import com.example.Course_Registration_System.Entity.Course;
import com.example.Course_Registration_System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;
    // ✅ Add single course
    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    // ✅ Add MULTIPLE courses (IMPORTANT)
    @PostMapping("/bulk")
    public List<Course> addMultipleCourses(@RequestBody List<Course> courses) {
        return courseService.addMultipleCourses(courses);
    }

    // Get only courses with available seats
    @GetMapping("/available")
    public List<CourseAvailabilityDTO> getAvailableCourses() {
        return courseService.getAvailableCourses();
    }
}
