package com.vti.Backend.Exercise5.Question1;

import java.util.Scanner;

public class NhanVien extends CanBo {

	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	public void hienTT() {
		System.out.println("= = = = Nhân viên = = = =");
		super.hienTT();
		System.out.println("Công việc: "+this.congViec);
	}
	
	public void nhapTT() {
		Scanner so = new Scanner(System.in);
		System.out.println("= = = = Nhân viên = = = =");
		super.nhapTT();
		System.out.println("Công việc: ");
		this.setCongViec(so.nextLine());
	}
}
