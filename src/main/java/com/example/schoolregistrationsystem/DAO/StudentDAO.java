package com.example.schoolregistrationsystem.DAO;

import java.util.List;

import com.example.schoolregistrationsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student, Integer> {
    // that's it ... no need to write any code LOL!

    // add a method to sort by last name
    public List<Student> findAllByOrderByLastNameAsc();

    // search by name
    public List<Student> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);

}
