package com.vti.Backend.Exercise6.Question1;

public class Contacts {

	private String name;
	private String number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Contacts [name=" + name + ", number=" + number + "]";
	}
	
	
}
