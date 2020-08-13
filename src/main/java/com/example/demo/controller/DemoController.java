package com.example.demo.controller;

import com.example.demo.entity.StudentInfo;
import com.example.demo.model.Student;
import com.example.demo.service.DemoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
public class DemoController {

    private DemoService demoService;

    @GetMapping("/student/{id}")
    StudentInfo getStudents(@PathVariable String id) {
        return demoService.findStudentByRollNumber(id);
    }

    @GetMapping("/student")
    List<StudentInfo> getAllStudents() {
        return demoService.findAllStudents();
    }

    @PostMapping("/student/add")
    StudentInfo insertStudent(@RequestBody Student student) {
        return demoService.addStudent(student);
    }

    @DeleteMapping("/student/delete/{id}")
    void deleteStudent(@PathVariable String id) {
        demoService.deleteStudentByRollNumber(id);
    }

}

