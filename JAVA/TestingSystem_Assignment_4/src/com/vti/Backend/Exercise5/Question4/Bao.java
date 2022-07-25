package com.vti.Backend.Exercise5.Question4;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Bao extends TaiLieu {

	private Date ngayPhatHanh;

	public Date getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(Date ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public void nhapTT() {
		System.out.println("==== Báo ====");
		Scanner sc = new Scanner(System.in);
		super.nhapTT();
		System.out.print("Nhập ngày: ");
		int ngay = sc.nextInt();
		System.out.print("Nhập tháng: ");
		int thang = sc.nextInt();
		System.out.print("Nhập năm: ");
		int nam = sc.nextInt();
		this.setNgayPhatHanh(new Date(nam, thang, ngay));
	}

	public void hienTT() {
		System.out.println("==== Báo ====");
		super.hienTT();
		System.out.print("Ngày phát phát hành: " + this.getNgayPhatHanh());
		System.out.println();
	}

}
