package com.example;

public class Airtel implements Sim {

	private String dataStrength;
	
	public String getDataStrength() {
		return dataStrength;
	}

	public void setDataStrength(String dataStrength) {
		this.dataStrength = dataStrength;
	}

	public void TypeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("Sim is an Airtel");
			}

	public void DataTypeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("Airtel has 5G data type");
	}

}
