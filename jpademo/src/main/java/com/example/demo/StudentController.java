package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	@Autowired
	StudentDao dao;
	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Student s=new Student();
	s.setName(request.getParameter("sname"));
	s.setPhono(Integer.parseInt(request.getParameter("sphono")));
	s.setEmail(request.getParameter("semail"));
	Student ss=dao.insert(s); 
	if(ss!=null) {
		mv.setViewName("status");
	}
	return mv;
	}
	
	
	@RequestMapping("/getall")
	public ModelAndView getall(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		List<Student> list=dao.getall();
		mv.setViewName("display");
		mv.addObject("list",list);
		return mv;	
	}
}


