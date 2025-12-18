package com.example.CrudDemo.Service;

import com.example.CrudDemo.Model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<StudentModel> s = new ArrayList<>(
            Arrays.asList(new StudentModel(1, "Sridharshan", "SpringBoot"),
                    new StudentModel(2, "Arun", "Python"))
    );

    public List<StudentModel> getStudents() {
        return s;
    }

    public StudentModel getStudentByRollno(int rollNo) {
        int index = 0;
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getRoll_no() == rollNo) {
                index = i;
                break;
            }
        }
        return s.get(index);
    }

    public String setStudent(StudentModel student) {
        s.add(student);
        return "Student added successfully ✅";
    }

    public String updateStudent(int rollNo, StudentModel updatedStudent) {

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getRoll_no() == rollNo) {
                s.get(i).setName(updatedStudent.getName());
                s.get(i).setTechnology(updatedStudent.getTechnology());

                return "Student updated successfully ✅";
            }
        }
        return "Student not found....";
    }

    public String deleteStudent(int rollNo) {

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getRoll_no() == rollNo) {
                s.remove(i);
                return "Student deleted successfully 🗑️✅";
            }
        }
        return "Student not found....";
    }

}

