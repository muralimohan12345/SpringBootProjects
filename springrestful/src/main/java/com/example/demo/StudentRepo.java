package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;                                                //pojo class, @Id
import org.springframework.data.jpa.repository.Query;

public interface StudentRepo extends JpaRepository<Student,Integer> {
   @Query("select student from Student student where student.name=?1")
   public Student findByname(String name);
}


