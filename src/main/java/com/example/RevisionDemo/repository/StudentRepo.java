package com.example.RevisionDemo.repository;

import com.example.RevisionDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    //StudentRepo object will inherit all the methods from the jpa repo fro the
    //crud operations
}
