package com.example.demo.repository;

import com.example.demo.entity.StudentInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends MongoRepository<StudentInfo, String> {


}
