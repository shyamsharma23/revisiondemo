package com.example.RevisionDemo.service;


import com.example.RevisionDemo.entity.Student;
import com.example.RevisionDemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    //method to find the single student
    public Student getSingleStudent(long id){
        return studentRepo.findById(id).get();
    }


    //method to create the Student data
    public void createStudent(Student student){

        studentRepo.save(student);
    }

    //method for fetching the list of Student data
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    //method to update the student object or row inside the Student table
    public void updateStudent(long id, Student newStudent){
        Student obj = studentRepo.findById(id).get();
        obj.setStuName(newStudent.getStuName());
        obj.setCourseName(newStudent.getCourseName());
        studentRepo.save(obj);


    }

    //method to delete the Student row inside the Student table
    public void deleteStudent(long id){
        studentRepo.deleteById(id);
    }


}
