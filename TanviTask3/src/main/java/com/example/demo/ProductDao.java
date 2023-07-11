package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductDao {
@Autowired 
   ProductRepo repo;

// insert
 public Product insert(Product p) {
	 return repo.save(p);
 }

 
 public List<Product> insertall(List<Product> p){
	 return repo.saveAll(p);
 }
 
 public String deleteByid(int id) {
	 repo.deleteById(id);
	 return "deleted the product"+id;
 }
 
 public Product update(Product p) {
	 Product pp=repo.findById(p.getProductId()).orElse(null);
	pp.setProductName(p.getProductName());
	pp.setProductCategory(p.getProductCategory());
	return repo.save(pp);
 }
 
 public List<Product> getall(){
	 return repo.findAll();
 }
 
 public Product findByname(String s) {
		return repo.findByname(s);
	 }

}
