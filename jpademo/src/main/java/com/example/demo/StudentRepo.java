package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
                                                //pojo class, @Id
public interface StudentRepo extends JpaRepository<Student,Integer> {

}


