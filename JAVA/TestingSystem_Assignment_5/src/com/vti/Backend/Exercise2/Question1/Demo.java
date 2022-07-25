package com.vti.Backend.Exercise2.Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.vti.Backend.Exercise1.Question2.Khoi;
import com.vti.Backend.Exercise1.Question2.ThiSinh;
import com.vti.Backend.Exercise1.Question2.TuyenSinh;

public class Demo implements IStudent {
	Scanner sc;
	Scanner scanner;
	private List<Student> ls;

	public Demo() {
		ls = new ArrayList<>();
		sc = new Scanner(System.in);
		scanner = new Scanner(System.in);
	}

	public void them() {
		System.out.print("Nhập số học sinh: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin học sinh thứ " + (i + 1));
			System.out.print("Nhập ID: ");
			String id = scanner.nextLine();
			System.out.print("Nhập tên học sinh: ");
			String name = scanner.nextLine();
			System.out.print("Nhập group: ");
			int group = sc.nextInt();
			Student ts = new Student(id, name, group);
			ls.add(ts);
			System.out.println("================");
		}
	}

	@Override
	public void diemDanh() {
		List<Student> rs = new ArrayList<>();
		System.out.println("Chọn khoảng đối tượng điểm danh");
		System.out.println("1.Cả lớp   2.Nhóm 1     3.Nhóm 2     4.Nhóm 3");
		String a = scanner.nextLine();
		switch (a) {
		case "1":
			rs = ls;
			break;
		case "2":
			for (Student student : ls) {
				if (student.getGroup() == 1) {
					rs.add(student);
				}
			}
			break;
		case "3":
			for (Student student : ls) {
				if (student.getGroup() == 2) {
					rs.add(student);
				}
			}
			break;
		case "4":
			for (Student student : ls) {
				if (student.getGroup() == 3) {
					rs.add(student);
				}
			}
			break;
		}
		for (Student student : rs) {
			System.out.println(student.getName()+" điểm danh");
		}
	}

	@Override
	public void hocBai() {
		List<Student> rs = new ArrayList<>();
		System.out.println("Chọn khoảng đối tượng học bài:");
		System.out.println("1.Cả lớp   2.Nhóm 1     3.Nhóm 2     4.Nhóm 3");
		String a = scanner.nextLine();
		switch (a) {
		case "1":
			rs = ls;
			break;
		case "2":
			for (Student student : ls) {
				if (student.getGroup() == 1) {
					rs.add(student);
				}
			}
			break;
		case "3":
			for (Student student : ls) {
				if (student.getGroup() == 2) {
					rs.add(student);
				}
			}
			break;
		case "4":
			for (Student student : ls) {
				if (student.getGroup() == 3) {
					rs.add(student);
				}
			}
			break;
		}
		for (Student student : rs) {
			System.out.println(student.getName()+" học bài");
		}
	}

	@Override
	public void donVeSinh() {
		List<Student> rs = new ArrayList<>();
		System.out.println("Chọn khoảng đối tượng dọn vệ sinh");
		System.out.println("1.Cả lớp   2.Nhóm 1     3.Nhóm 2     4.Nhóm 3");
		String a = scanner.nextLine();
		switch (a) {
		case "1":
			rs = ls;
			break;
		case "2":
			for (Student student : ls) {
				if (student.getGroup() == 1) {
					rs.add(student);
				}
			}
			break;
		case "3":
			for (Student student : ls) {
				if (student.getGroup() == 2) {
					rs.add(student);
				}
			}
			break;
		case "4":
			for (Student student : ls) {
				if (student.getGroup() == 3) {
					rs.add(student);
				}
			}
			break;
		}
		for (Student student : rs) {
			System.out.println(student.getName()+" dọn vệ sinh");
		}
	}

	public static void main(String[] args) {
		Demo my = new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời demo:");
		while (true) {
			System.out.println("1.insert    2.check in   3.học bài    4.dọn vệ sinh    e. exit");
			String s = sc.nextLine();
			switch (s) {
			case "1":
				my.them();
				break;
			case "2":
				my.diemDanh();
				break;
			case "3":
				my.hocBai();
				break;
			case "4":
				my.donVeSinh();
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
