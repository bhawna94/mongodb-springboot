package com.example.demo.entity;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Builder
@Document
public class StudentInfo {

    @Id
    private String studentId;

    private String name;

    @Builder.Default
    private String role = "Student";
}
