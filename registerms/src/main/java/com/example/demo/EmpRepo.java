package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpRepo extends JpaRepository<Employee,String> {

	@Query("select employee from Employee employee where employee.suser=?1")
	public Employee findbyuser(String user);
	@Query("select employee from Employee employee where employee.spassword=?1")
	public Employee findbypwd(String pwd);
}

