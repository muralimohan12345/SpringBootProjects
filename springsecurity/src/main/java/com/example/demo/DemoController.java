package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@ResponseBody
  @RequestMapping("/")
  public String all() {
	return "hii murali mohan all!!";
 }
	
	@ResponseBody
	  @RequestMapping("/user")
	  public String user() {
		return "hii murali mohan user!!";
	 }
	
	@ResponseBody
	  @RequestMapping("/admin")
	  public String admin() {
		return "hii murali mohan admin!!";
	 }
}

