package com.example.schoolregistrationsystem.controller;

import com.example.schoolregistrationsystem.entity.Student;
import com.example.schoolregistrationsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/list")
    public String studentList(Model model){
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "employee-list";
    }

    @GetMapping("/showStudentForm")
    public String studentForm(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "student-form";
    }
    @PostMapping("/save")
    public String saveStudentForm(@ModelAttribute("student") Student student){
        studentService.save(student);
        return "redirect:/student/list";
    }

    @GetMapping("/updateShowForm")
    public String updateShowForm(@RequestParam("studentId") int id, Model model){
        Optional<Student> student = studentService.findById(id);
         model.addAttribute("student", student);
        return "student-form";
    }
    @GetMapping("/deleteShowForm")
    public String deleteShowForm(@RequestParam("studentId") int id){
          studentService.deleteById(id);
          return "redirect:/student/list";
    }


}
