package com.vti.Backend.Exercise4;

import java.security.KeyStore.PrivateKeyEntry;

import javax.naming.InsufficientResourcesException;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private float point;

	public Student() {
	}

	public Student(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.point = 0f;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}
	//d
	public void congDiem(int id, float diem) {
		this.point +=diem;
	}

	@Override
	public String toString() {
		String a = "";
		if (this.point<4) {
			a="Yếu";
		}else if (this.point<6) {
			a="Trung bình";
		}else if (this.point<8) {
			a="Khá";
		}else {
			a="Giỏi";
		}
		return "Student [id=" + id + ", name=" + name + ", hometown=" + hometown + ", point=" + point + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getHometown()=" + getHometown() + ", getPoint()="
				+ getPoint() +", Loại: "+ a +"]";
	}
	
	public static void main(String[] args) {
		Student st = new Student("dong", "HT");
		st.id=1;
		st.setPoint(6);
		System.out.println(st.toString());
	}
	

}
