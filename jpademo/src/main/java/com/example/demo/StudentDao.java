package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentDao {
@Autowired
	StudentRepo repo;
	
//insert
public Student insert(Student s) {
	return repo.save(s);
}

//delete 
public void deleteByid(int id) {
	repo.deleteById(id);
	
}

//update
/*
 * 1 karthik 900077777 k@c.c->existing
 * private int sid;
	private String name;
	private int phono;
	private String email;
	
	*find the row -update the value and insert it again
	*/
                          //1 kishore 900077777 k@c.c
public Student update(Student s) {
	//
	Student ss=repo.findById(s.getSid()).orElse(null);
	            //kishore
	ss.setName(s.getName());
	return repo.save(ss);
}



//retreive
public List<Student> getall(){
	return repo.findAll();
}


	
}


