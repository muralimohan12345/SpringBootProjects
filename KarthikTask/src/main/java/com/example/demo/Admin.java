package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Admin {
@Id
	private String suser;
	private String spassword;
	private String semail;
}


