package com.example.Course_Registration_System.Dto;

import lombok.Data;

@Data
public class StudentRegistrationDTO {

    private String studentName;
    private String email;
    private String mobile;

    private Integer courseId;   // ✅ MUST be Integer
}
