package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component
 
public class Xpreso implements Coffee{
	@Autowired
 Capacino capacino;
	public void typeOfCoffee() {
		// TODO Auto-generated method stub
		System.out.println("This is a Xpreso coffee");
	}

	public void rateOfCoffee() {
		// TODO Auto-generated method stub
		System.out.println("Xpreso coffee cost is 120 rs");
		System.out.println("this is cap cost into");
		
		capacino.rateOfCoffee();
//		capacino.typeOfCoffee();
	} 

}
