package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Component
@Primary
public class Capacino implements Coffee {
 private String cream;
 
	
	public String getCream() {
	return cream;
}
 @Value("yes")
public void setCream(String cream) {
	this.cream = cream;
}

	public void typeOfCoffee() {
		// TODO Auto-generated method stub
		System.out.println("This is a capacino coffee");
	}

	public void rateOfCoffee() {
		// TODO Auto-generated method stub
		System.out.println("Capacino coffee cost is 100 rs");
	}

}
