package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
@Autowired
	EmpRepo repo;
Logger log=Logger.getAnonymousLogger();
@ResponseBody
@RequestMapping("/login")
public ModelAndView login(HttpServletRequest req, HttpServletResponse resp) {
	ModelAndView mv = new ModelAndView();
	String suser = req.getParameter("suser");
	String spassword = req.getParameter("spassword");
	log.info("value is set");
	
	log.info("findbyuser:"+repo.findByUser(suser));
	log.info("findbypwd:"+repo.findByPwd(spassword));
	if(repo.findByUser(suser).equals(repo.findByPwd(spassword))) {
		log.info("in condition");
		
		HttpSession session = req.getSession();
		session.setAttribute("suser", suser);
		mv.setViewName("display.jsp");
		}
	else {
		mv.setViewName("fail.jsp");
		
		
	}
return mv;
}
//registration details, this have to send to another microservice for that we use 
RestTemplate rest = new RestTemplate();
@ResponseBody
@RequestMapping("/register")
public String register(HttpServletRequest req, HttpServletResponse resp) {
	String suser= req.getParameter("suser");
	String spassword= req.getParameter("spassword");
	String semail=req.getParameter("semail");
	log.info("inside register with url");
	String url="Http://localhost:8082/register-user/"+suser+"/"+spassword+"/"+semail;
	rest.getForObject(url, String.class); 
	return "success";
}

@ResponseBody
@RequestMapping("/logout")
public String logout(HttpServletRequest req, HttpServletResponse resp) {
	 HttpSession session = req.getSession();
	 session.invalidate();
	 return "logout successful";
}
}
