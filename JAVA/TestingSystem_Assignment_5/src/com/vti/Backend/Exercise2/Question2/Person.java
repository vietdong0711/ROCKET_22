package com.vti.Backend.Exercise2.Question2;

import java.util.Scanner;

public abstract class Person {

	private String name;
	private String sex;
	private String dateOfBirth;
	private String address;
	
	public Person() {
		
	}

	public Person(String name, String sex, String dateOfBirth, String address) {
		super();
		this.name = name;
		this.sex = sex;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void inputInfo() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên:");
		this.name = scanner.nextLine();
		System.out.print("Nhập giới tính: ");
		this.sex = scanner.nextLine();
		System.out.print("Nhập ngày sinh: ");
		this.dateOfBirth = scanner.nextLine();
		System.out.print("Nhập địa chỉ: ");
		this.address = scanner.nextLine();
		
	}
	
	public void showInfo() {
		System.out.println("Tên :"+this.getName());
		System.out.println("Giới tính: "+this.getSex());
		System.out.println("Ngày sinh: "+this.getDateOfBirth());
		System.out.println("Địa chỉ: "+this.getAddress());
	}
}
