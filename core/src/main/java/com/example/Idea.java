package com.example;

public class Idea implements Sim {
	private String dataStrength;
	

	public Idea(String dataStrength) {
		super(); //we can use super() to call parent default constructor
		this.dataStrength = dataStrength;
	}

	public void TypeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("It is an Idea sim");
	}

	public void DataTypeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("Idea has a 4G data type");
	}
	public void displayStrength() {
	System.out.println(dataStrength);
	}
}
