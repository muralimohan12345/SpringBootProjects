package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

	@Data
	@Entity

	public class Employee {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column
	 private long id;
	 private String firstName;
	 private String lastName;
	 private String emailId;
	 
	

}
