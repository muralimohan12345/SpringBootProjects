
package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.User;
import com.example.demo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	public User addUser(User u) {
		return repo.save(u);
	}
	public List<User> getAllUser(){
		return repo.findAll();
	}
	public User getUserById(int id) {
		if(repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}
		else {
			return null;
		}
		
	}
	public User updateUser(int id, User newUser) {
		if(repo.findById(id).isPresent()) {
			User olduser= repo.findById(id).get();
			olduser.setName(newUser.getName());
			olduser.setEmail(newUser.getEmail());
			olduser.setCountry(newUser.getCountry());
			
			return repo.save(olduser);
		}
		else {
			return null;
		}
	}
	
	
	public boolean deleteUser(int id) {
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return true;
		}
		
		else {
			return false;
		}
	}
	
	

}