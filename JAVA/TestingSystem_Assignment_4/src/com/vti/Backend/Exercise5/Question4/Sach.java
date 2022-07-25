package com.vti.Backend.Exercise5.Question4;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	public void nhapTT() {
		System.out.println("==== Sách ====");
		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		super.nhapTT();
		System.out.print("Nhập tên tác giả: ");
		this.setTenTacGia(sc.nextLine());
		System.out.print("Nhập số trang: ");
		this.setSoTrang(scanner.nextInt());
	}
	
	public void hienTT() {
		System.out.println("==== Sách ====");
		super.hienTT();
		System.out.print("Tên tác giả: "+this.getTenTacGia());
		System.out.print("Số trang: "+this.getSoTrang());
		System.out.println();
	}
}
