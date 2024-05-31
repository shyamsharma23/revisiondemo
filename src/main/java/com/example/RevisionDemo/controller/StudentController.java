package com.example.RevisionDemo.controller;


import com.example.RevisionDemo.entity.Student;
import com.example.RevisionDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> fetchAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getSingleStudent(@PathVariable("id") long id){
        return studentService.getSingleStudent(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") long id){
        studentService.deleteStudent(id);
    }

    @PostMapping
    public void createStudent(@RequestBody Student student){

        studentService.createStudent(student);

    }

    @PutMapping("/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable("id") long id){
        studentService.updateStudent(id, student);
    }



}
