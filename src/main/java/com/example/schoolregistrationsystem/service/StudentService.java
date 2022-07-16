package com.example.schoolregistrationsystem.service;

import com.example.schoolregistrationsystem.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();
    Optional<Student> findById(int id);
    void save(Student student);
    void deleteById(int id);

}
