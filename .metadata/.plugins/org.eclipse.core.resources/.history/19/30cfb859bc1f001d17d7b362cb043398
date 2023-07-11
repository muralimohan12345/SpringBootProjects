package com.example.demo;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@ResponseBody
@Controller
public class productController {

	@Autowired
	productDao dao;
	
	Logger log=Logger.getAnonymousLogger();	
	@RequestMapping("/add")
	public String insert(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		log.info("inside the product control");
		product p=new product();
		log.info("inside the product object");
	p.setId(Integer.parseInt(request.getParameter("id")));
	log.info("inside the id");
	p.setDescription(request.getParameter("description"));
	p.setPrice(Integer.parseInt(request.getParameter("price")));
	p.setProduct(request.getParameter("product"));
	p.setQuantity(Integer.parseInt(request.getParameter("quantity")));
	product pp=dao.insert(p);
	log.info("inserted successful");
	if(pp!=null) {
		mv.setViewName("success.jsp");
	}
	return "inserted succeessfully...check in the all the products";
	}

@RequestMapping("/getall")
public ModelAndView getall(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	List<product> list=dao.getall();
	mv.setViewName("allProducts.jsp");
	mv.addObject("list",list);
	return mv;	
 }

@RequestMapping("/getAllForUser")
public ModelAndView getAllForUser(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	List<product> list=dao.getall();
	mv.setViewName("allProductsForUsers.jsp");
	mv.addObject("list",list);
	return mv;	
 }

@RequestMapping("/update")
public String update(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	log.info("inside the update product control");
	product p=new product();
	log.info("inside the update product object");
p.setId(Integer.parseInt(request.getParameter("id")));
log.info("inside the update id");
p.setDescription(request.getParameter("description"));
p.setPrice(Integer.parseInt(request.getParameter("price")));
p.setProduct(request.getParameter("product"));
p.setQuantity(Integer.parseInt(request.getParameter("quantity")));
product pp=dao.insert(p);
log.info("inserted successful");
 if(pp!=null) {
	mv.setViewName("success.jsp");
}
return "updated successfully...check in the all the products";

 }
  @RequestMapping("/delete")
  public String delete(HttpServletRequest request,HttpServletResponse response) {
	  log.info("inside the delete method");
	  product p=new product();
	  log.info("inside the delete product method");
	  p.deleteByid(Integer.parseInt(request.getParameter("id")));
	  log.info("inside the delete by id");
	return "deleted successfully....check in the all the products";	  
 }
}
//	}
//	@RequestMapping("/add")	
//	public ModelAndView insert(@RequestParam("id") int id,
//			                   @RequestParam("product")String product,
//			                   @RequestParam("description")String description,
//			                   @RequestParam("price") int price,
//			                   @RequestParam("quantity") int quantity
//			                   ){
//		log.info("insereted 5");
//		log.info("inside the product control");
//		ModelAndView mv= new ModelAndView();
//		product p=new product();
//		product pp=dao.insert(p);
//		mv.addObject("product",product);
//		mv.addObject("description",description);
//		mv.addObject("price",price);
//		mv.addObject("quantity",quantity);
//		
//		if(pp!=null) {
//			mv.setViewName("success.jsp");
//		}
//		else
//		{
//			mv.setViewName("failure.jsp");
//		}
//	
		
//		return mv;
//	}
//}