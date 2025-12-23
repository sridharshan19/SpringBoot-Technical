package com.example.Course_Registration_System.Service;

import com.example.Course_Registration_System.Dto.CourseAvailabilityDTO;
import com.example.Course_Registration_System.Entity.Course;
import com.example.Course_Registration_System.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {

        @Autowired
        private CourseRepository courseRepository;

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }


    public List<Course> addMultipleCourses(List<Course> courses) {
        return courseRepository.saveAll(courses);
    }

    public List<CourseAvailabilityDTO> getAvailableCourses() {

        return courseRepository.findAll().stream()
                .map(course -> {
                    int occupied = course.getStudents().size();
                    int available = course.getMaxSeats() - occupied;

                    return new CourseAvailabilityDTO(
                            (long) course.getCourseId(),
                            course.getCourseName(),
                            course.getDuration(),
                            course.getTrainerName(),
                            available
                    );
                })
                .filter(dto -> dto.getAvailableSeats() > 0)
                .toList();
        }
    }
