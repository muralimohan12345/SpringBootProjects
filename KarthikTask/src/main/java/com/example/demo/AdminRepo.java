package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepo extends JpaRepository<Admin,String> {

//	@Query("select admin from Admin admin where admin.user=?1")
//	public Admin findbyuser(String user);
//	@Query("select admin from Admin admin where admin.password=?1")
//	public Admin findbypwd(String pwd);
}

