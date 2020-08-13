package com.example.demo.service;

import com.example.demo.entity.StudentInfo;
import com.example.demo.model.Student;
import com.example.demo.repository.DemoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class DemoService {

    private DemoRepository repository;

    public StudentInfo addStudent(Student student) {
        StudentInfo studentInfo = StudentInfo.builder()
                .name(student.getName())
                .studentId(student.getRollNumber())
                .build();

        return repository.save(studentInfo);
    }

    public StudentInfo findStudentByRollNumber(String id) {

        return repository.findById(id).orElseThrow(() -> new NoSuchElementException("No element exists"));
    }

    public List<StudentInfo> findAllStudents() {

        return repository.findAll();
    }

    public void deleteStudentByRollNumber(String id) {

        repository.deleteById(id);
    }

}
