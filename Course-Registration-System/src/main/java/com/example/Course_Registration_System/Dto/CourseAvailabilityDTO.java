package com.example.Course_Registration_System.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseAvailabilityDTO {

    private Long courseId;
    private String courseName;
    private String duration;
    private String trainerName;
    private int availableSeats;

}

