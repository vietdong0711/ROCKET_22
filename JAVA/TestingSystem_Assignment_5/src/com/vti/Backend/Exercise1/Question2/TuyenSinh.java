package com.vti.Backend.Exercise1.Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {

	private Scanner sc;
	private Scanner scanner;
	private List<ThiSinh> ls;

	public TuyenSinh() {
		ls = new ArrayList<>();
		sc = new Scanner(System.in);
		scanner = new Scanner(System.in);
	}

	@Override
	public void them() {
		System.out.print("Nhập số thí sinh");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin thí sinh thứ " + (i + 1));
			System.out.print("Nhập số báo danh: ");
			String sbd = scanner.nextLine();
			System.out.print("Nhập tên thí sinh: ");
			String name = scanner.nextLine();
			System.out.print("Nhập địa chỉ: ");
			String address = scanner.nextLine();
			System.out.print("Nhập mức độ ưu tiên: ");
			String muc = scanner.nextLine();
			System.out.print("Nhập khối: ");
			String khoi = scanner.nextLine();
			ThiSinh ts = new ThiSinh(sbd, name, address, muc, new Khoi(khoi));
			ls.add(ts);
			System.out.println("================");
		}
	}

	@Override
	public void hienThi() {
		for (ThiSinh thiSinh : ls) {
			System.out.println(thiSinh.toString());
		}
	}

	@Override
	public void timkiem() {
		System.out.print("Nhập số báo danh cần tìm kiếm: ");
		String sbd = scanner.nextLine();
		List<ThiSinh> tk = new ArrayList<>();
		for (ThiSinh thiSinh : ls) {
			if (thiSinh.getSoBaoDanh().equals(sbd)) {
				tk.add(thiSinh);
			}
		}
		if (tk.size() == 0) {
			System.out.println("Không có kết quả phù hợp!");
		} else {
			System.out.println("Kết quả tìm kiếm là:");
			for (ThiSinh thiSinh : tk) {
				System.out.println(thiSinh.toString());
			}
		}
	}

	public static void main(String[] args) {
		TuyenSinh my = new TuyenSinh();
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời demo:");
		while (true) {
			System.out.println("1.insert    2.view list   3.search    e.exit");
			String s = sc.nextLine();
			switch (s) {
			case "1":
				my.them();
				break;
			case "2":
				my.hienThi();
				break;
			case "3":
				my.timkiem();
				break;
			case "e":
				return;
			default:
				System.out.println("Nhập không đúng, mời nhập lại");
				break;
			}
		}
	}
}