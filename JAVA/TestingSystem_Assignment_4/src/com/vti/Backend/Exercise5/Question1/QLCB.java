package com.vti.Backend.Exercise5.Question1;

import java.util.Scanner;

public class QLCB {

	private CanBo[] qlcbs;
	
	public void themCB() {
		Scanner so = new Scanner(System.in);
		Scanner chu = new Scanner(System.in);
		System.out.print("Nhập số cán bộ: ");
		int n = so.nextInt();
		System.out.println("\nThêm ds cán bộ");
		qlcbs = new CanBo[n];
		for (int i = 0; i < qlcbs.length; i++) {
			System.out.println("Nhập cán bộ thứ "+(i+1)+":(1.Công nhân   2.Kỹ sư    nhập khác.Nhân viên)");
			String x = chu.nextLine();
			switch (x) {
			case "1":
				qlcbs[i] = new CongNhan();
				qlcbs[i].nhapTT();
				break;
			case "2":
				qlcbs[i] = new KySu();
				qlcbs[i].nhapTT();
				break;
			default:
				qlcbs[i] = new NhanVien();
				qlcbs[i].nhapTT();
				break;
			
			}
		}
		
	}
	
	public void hienTT() {
		System.out.println();
		System.out.println("Danh sách cán bộ là: ");
		for (int i = 0; i < qlcbs.length; i++) {
			qlcbs[i].hienTT();
		}
	}
	
	public void search() {
		Scanner chu = new Scanner(System.in);
		System.out.print("Nhập tên cần tìm kiếm: ");
		String name = chu.nextLine();
		int dem=0;
		System.out.println("Các tài khoản có liên quan là:");
		for (int i = 0; i < qlcbs.length; i++) {
			if (qlcbs[i].getHoTen().contains(name)) {
				qlcbs[i].hienTT();
				dem++;
			}
		}
		if (dem==0) {
			System.out.println("Không có  tài khoản có liên quan");
		}
	}
	
	public void delete() {
		Scanner chu = new Scanner(System.in);
		System.out.print("Nhập tên cần xóa: ");
		String name = chu.nextLine();
		int dem=0;
		
		for (int i = 0; i < qlcbs.length; i++) {
			if (qlcbs[i].getHoTen().equals(name)) {
				for (int j = i; j < qlcbs.length-1; j++) {
					qlcbs[i]=qlcbs[i+1];
				}
				qlcbs[qlcbs.length-1]=null;
				
			}
		}
		if (dem==0) {
			System.out.println("Không có tài khoản liên quan");
		}else {
			System.out.println("đã xóa các tài khoản có liên quan");
		}
	}
	
	public static void main(String[] args) {
		QLCB a = new QLCB();
		a.themCB();
		a.hienTT();
		a.search();
		a.delete();
	}
}
