package com.vti.Backend.Exercise5.Question4;

import java.util.Scanner;

public class TapChi extends TaiLieu {
 
	private String soPhatHanh;
	private String thangPhatHanh;

	public String getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(String soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public String getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(String thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}
	
	public void nhapTT() {
		System.out.println("==== Tạp chí ====");
		Scanner sc = new Scanner(System.in);
		super.nhapTT();
		System.out.print("Nhập số phát hành: ");
		this.setSoPhatHanh(sc.nextLine());
		System.out.print("Nhập tháng phát hành: ");
		this.setThangPhatHanh(sc.nextLine());
	}
	
	public void hienTT() {
		System.out.println("==== Tạp chí ====");
		super.hienTT();
		System.out.print("Số phát hành: "+this.getSoPhatHanh());
		System.out.print("Tháng phát hành: "+this.getThangPhatHanh());
		System.out.println();
	}

}
