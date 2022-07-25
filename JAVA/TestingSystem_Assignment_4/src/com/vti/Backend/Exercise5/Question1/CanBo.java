package com.vti.Backend.Exercise5.Question1;

import java.util.Scanner;

public class CanBo {

	private String hoTen;
	private int tuoi;
	private GioiTinh gioiTinh;
	private String diaChi;

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(GioiTinh gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void nhapTT() {
		Scanner so = new Scanner(System.in);
		Scanner chu = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		this.setHoTen(chu.nextLine());
		System.out.println("Nhập tuổi: ");
		this.setTuoi(so.nextInt());
		System.out.println("Nhập giới tính:(1.NAM/2.NU/Khác.KHAC) ");
		String a = chu.nextLine();
		switch (a) {
		case "1":
			this.setGioiTinh(GioiTinh.NAM);
			break;
		case "2":
			this.setGioiTinh(GioiTinh.NU);
			break;
		default:
			this.setGioiTinh(GioiTinh.KHAC);
			break;
		}
		System.out.println("Nhập địa chỉ: ");
		this.setDiaChi(chu.nextLine());
	}

	public void hienTT() {
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println("Tuổi: " + this.tuoi);
		System.out.println("Giới tính: " + this.gioiTinh);
		System.out.println("Địa chỉ: " + this.diaChi);
	}
	public static void main(String[] args) {
		CanBo cbBo = new CanBo();
		cbBo.nhapTT();
		cbBo.hienTT();
	}

}
