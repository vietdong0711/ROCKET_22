package com.vti.Backend.Exercise2.Question3;

public class Main {
	
	public static void main(String[] args) {
		HinhVuong hinhVuong = (HinhVuong) new HinhChuNhat(2, 2);
		System.out.println("Diện tích hình vuông là: "+hinhVuong.tinhChuVi());
	}
}
