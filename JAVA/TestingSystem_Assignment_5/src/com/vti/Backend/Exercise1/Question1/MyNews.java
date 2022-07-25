package com.vti.Backend.Exercise1.Question1;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {

	private ArrayList<News> ls = new ArrayList<>();

	public void insert() {
		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số tin tức:");
		int sl = sc.nextInt();
		for (int i = 0; i < sl; i++) {
			System.out.println("Phần tử thứ:" + (i + 1));
			News news = new News();
			System.out.print("Nhập ID: ");
			news.setId(sc.nextInt());
			System.out.print("Nhập Title: ");
			news.setTitle(scanner.nextLine());
			System.out.print("Nhập Publish Date: ");
			news.setPublishDate(scanner.nextLine());
			System.out.print("Nhập Author: ");
			news.setAuthor(scanner.nextLine());
			System.out.print("Nhập Content: ");
			news.setContent(scanner.nextLine());
			System.out.print("Nhập  rate 1: ");
			int r1 = sc.nextInt();
			System.out.print("Nhập  rate 2: ");
			int r2 = sc.nextInt();
			System.out.print("Nhập  rate 3: ");
			int r3 = sc.nextInt();
			int[] aa = { r1, r2, r3 };
			news.setRates(aa);

			ls.add(news);
			System.out.println("========");
		}
	}

	public void view() {
		if (ls.size() == 0) {
			System.out.println("DS đang rỗng");
		} else {
			for (News news : ls) {      
				news.Display();
			}
		}
	}

	public void average() {
		if (ls.size() == 0) {
			System.out.println("DS đang rỗng");
		} else {
			for (News news : ls) {
				news.Caculate();
				news.Display();
			}
		}
	}

	public static void main(String[] args) {
		MyNews my = new MyNews();
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời demo:");
		while (true) {
			System.out.println("1.insert    2.view list   3.average rate    e.exit");
			String s = sc.nextLine();
			switch (s) {
			case "1":
				my.insert();
				break;
			case "2":
				my.view();
				break;
			case "3":
				my.average();
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
