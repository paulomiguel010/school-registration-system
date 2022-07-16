package com.example.schoolregistrationsystem.service;

import com.example.schoolregistrationsystem.DAO.StudentDAO;
import com.example.schoolregistrationsystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpl(StudentDAO employeeRepository) {
        this.studentDAO = employeeRepository;
    }

    @Override
    public List<Student> findAll() {
       return  studentDAO.findAll();
    }

    @Override
    public Optional<Student> findById(int id) {
       return studentDAO.findById(id);
    }

    @Override
    public void save(Student student) {
       studentDAO.save(student);
    }

    @Override
    public void deleteById(int id) {
      studentDAO.deleteById(id);
    }
}
