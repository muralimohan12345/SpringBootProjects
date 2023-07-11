package com.example.demo;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
@Autowired
	AdminRepo repo;
Logger log=Logger.getAnonymousLogger();

@RequestMapping("/login")
public ModelAndView login(HttpServletRequest req,HttpServletResponse res) {
	ModelAndView mv=new ModelAndView();
	String user=req.getParameter("user");
	String password=req.getParameter("password");
	log.info("value is set");
//	log.info("findbyuser: "+repo.findbyuser(user));
//	log.info("findbypwd:"+repo.findbypwd(password));
//	if(repo.findbyuser(user).equals(repo.findbypwd(password))){
//		log.info("in condition");
		
		HttpSession session=req.getSession();
		session.setAttribute("user", user);
		mv.setViewName("display.jsp");
	return mv;
 }
@RequestMapping("/getall")
public ModelAndView getall(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
//	List<Student> list=dao.getall();
	mv.setViewName("display");
//	mv.addObject("list",list);
	return mv;	
}
}




