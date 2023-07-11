package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1") 

public class ProductController {
  @Autowired
     ProductDao dao;
 
 @PostMapping("/insert")
  public Product insert(@RequestBody Product p) {
//	 return dao.insert(p);
	 return dao.insert(p);

 } 
 
 @PostMapping("/insertall")
   public List<Product> insertall(@RequestBody List<Product> p){
	 return dao.insertall(p);
 }
 
 @GetMapping("/getall")
   public List<Product> getall(){
	 return dao.getall();
 }
 
 @DeleteMapping("/deletebyid/{id}")
     public String deletebyid(@PathVariable int id) {
	 return dao.deleteByid(id);
 }
 
 @PutMapping("/update")
   public Product update(@RequestBody Product p) {
	 return dao.update(p);
 }
 
 @GetMapping("/getbyname/{name}")
	public Product findByname(@PathVariable String name) {
		return dao.findByname(name);
	}
 
}
