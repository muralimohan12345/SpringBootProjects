package com.example;


import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.glvc.student;
import com.glvc.studentDAO;

/**
 * Hello world!
 *
 */
public class App 
{  
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
       ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
       student s=ac.getBean(student.class);
       Scanner sc=new Scanner(System.in);
//        System.out.println("enter student id");
//       s.setSid(sc.nextInt());
       System.out.println("enter student name");
       s.setName(sc.next());
       studentDAO dao=ac.getBean(studentDAO.class);
       if(dao.insert(s)>0) {
   	   System.out.println("insertion is successfull");
       }
       else {
    	   System.out.println("insertion failed");
       }
       
       List<student> ss=dao.getall();
       for(student student:ss) {
    	   System.out.println(student.getSid()+"   "+student.getName());
       }
       
    }
}


