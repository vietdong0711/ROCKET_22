package com.vti.Backend.Exercise5.Question4;

import java.util.Scanner;

import com.vti.Backend.Exercise5.Question1.CanBo;
import com.vti.Backend.Exercise5.Question1.CongNhan;
import com.vti.Backend.Exercise5.Question1.KySu;
import com.vti.Backend.Exercise5.Question1.NhanVien;
import com.vti.Backend.Exercise5.Question1.QLCB;

public class QLTV {

	TaiLieu[] taiLieus;
	
	public void themCB() {
		Scanner so = new Scanner(System.in);
		Scanner chu = new Scanner(System.in);
		System.out.print("Nhập số cán bộ: ");
		int n = so.nextInt();
		System.out.println("\nThêm ds cán bộ");
		taiLieus = new TaiLieu[n];
		for (int i = 0; i < taiLieus.length; i++) {
			System.out.println("Nhập cán bộ thứ "+(i+1)+":(1.Sách   2.Tạp chí   nhập khác.Báo)");
			String x = chu.nextLine();
			switch (x) {
			case "1":
				taiLieus[i] = new Sach();
				taiLieus[i].nhapTT();
				break;
			case "2":
				taiLieus[i] = new TapChi();
				taiLieus[i].nhapTT();
				break;
			default:
				taiLieus[i] = new Bao();
				taiLieus[i].nhapTT();
				break;
			
			}
		}
		
	}
	
	public void hienTT() {
		System.out.println();
		System.out.println("Danh sách tài liệu là: ");
		for (int i = 0; i < taiLieus.length; i++) {
			taiLieus[i].hienTT();
		}
	}
	
	public void search() {
		Scanner chu = new Scanner(System.in);
		System.out.print("Nhập mã cần tìm kiếm: ");
		String name = chu.nextLine();
		int dem=0;
		System.out.println("Các tài khoản có liên quan là:");
		for (int i = 0; i < taiLieus.length; i++) {
			if (taiLieus[i].getMaTaiLieu().equals(name)) {
				taiLieus[i].hienTT();
				dem++;
			}
		}
		if (dem==0) {
			System.out.println("Không có  tài liệu có liên quan");
		}
	}
	
	public void delete() {
		Scanner chu = new Scanner(System.in);
		System.out.print("Nhập tên cần xóa: ");
		String name = chu.nextLine();
		int dem=0;
		
		for (int i = 0; i < taiLieus.length; i++) {
			if (taiLieus[i].getMaTaiLieu().equals(name)) {
				for (int j = i; j < taiLieus.length-1; j++) {
					taiLieus[i]=taiLieus[i+1];
				}
				taiLieus[taiLieus.length-1]=null;
				
			}
		}
		if (dem==0) {
			System.out.println("Không tài liệu liên quan");
		}else {
			System.out.println("đã xóa các tài liệu có liên quan");
		}
	}
	
	public static void main(String[] args) {
		QLTV a = new QLTV();
		a.themCB();
		a.hienTT();
		a.search();
		a.delete();
	}
	
	
}
