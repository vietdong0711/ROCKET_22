package com.vti.Backend.Exercise5.Question4;

import java.util.Scanner;

public class TaiLieu {

	private String maTaiLieu;
	private String tenNXB;
	private int soBanPhatHanh;

	public String getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getTenNXB() {
		return tenNXB;
	}

	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập mã tài liệu: ");
		this.setMaTaiLieu(sc.nextLine());
		System.out.print("Nhập tên nhà xuất bản: ");
		this.setTenNXB(sc.nextLine());
		System.out.print("Nhập số bản phát hành: ");
		this.setSoBanPhatHanh(scanner.nextInt());
	}

	public void hienTT() {
		System.out.print("Mã tài liệu: " + this.maTaiLieu);
		System.out.print("Tên nhà xuất bản: " + this.tenNXB);
		System.out.print("Số bản phát hành: " + this.soBanPhatHanh);
	}
}
