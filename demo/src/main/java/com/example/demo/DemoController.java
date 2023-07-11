package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	Logger log=Logger.getAnonymousLogger();
@ResponseBody
	@RequestMapping("/add")
//	public String displayadd(HttpServletRequest req,HttpServletResponse res) {
//		int result=Integer.parseInt(req.getParameter("no1"))+Integer.parseInt(req.getParameter("no2"));
//	return "sum of the numbers are "+result;
//	}
public ModelAndView displayadd(HttpServletRequest req,HttpServletResponse res) {
	ModelAndView mv=new ModelAndView();
	log.info("entered into request mapping");
int result=Integer.parseInt(req.getParameter("no1"))+Integer.parseInt(req.getParameter("no2"));
     log.info("calculation result is"+result);
     log.info("control is going to display.jsp with the result");
mv.setViewName("display");
mv.addObject("res", result);
return mv;
}

	
@ResponseBody
@RequestMapping("/sub")
public String displaysub(HttpServletRequest req,HttpServletResponse res) {
	int result=Integer.parseInt(req.getParameter("no1"))-Integer.parseInt(req.getParameter("no2"));
return "subof the numbers are "+result;
}
}






