package com.vti.Backend.Exercise2.Question2;

import java.util.Scanner;

public class Student extends Person {

	private String maSV;
	private float diemTB;
	private String email;

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		super.inputInfo();
		System.out.print("Nhập mã sinh viên:");
		this.maSV = scanner.nextLine();
		System.out.print("Nhập điểm TB: ");
		this.diemTB = scanner.nextFloat();
		System.out.print("Nhập email: ");
		this.email = scanner.nextLine();
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Mã sinh viên:"+this.maSV);
		System.out.println("Điểm TB: "+this.diemTB);
		System.out.println("Email: "+this.email);
	}
	
	public void xetHB() {
		if (this.diemTB>=8) {
			System.out.println("Được học bổng");
		}else {
			System.out.println("Không được học bổng");
		}
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		st.inputInfo();
		st.showInfo();
		st.xetHB();
	}
}
