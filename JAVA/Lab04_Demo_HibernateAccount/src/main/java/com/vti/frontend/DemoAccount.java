package com.vti.frontend;

import java.util.Scanner;

public class DemoAccount {
	public static void main(String[] args) {
		AccountFunction accountFunction = new AccountFunction();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.println("------MỜI BẠN CHỌN CHỨC NĂNG------");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                        Choose please                                     |%n");

			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Danh sách Account");
			System.out.format(leftAlignFormat, "2. Tạo Account");
			System.out.format(leftAlignFormat, "3. Update Account");
			System.out.format(leftAlignFormat, "4. Delete Account");
			System.out.format(leftAlignFormat, "5. Find Account By ID");
			System.out.format(leftAlignFormat, "10. Exit");
			System.out.format("+--------------------------------------------------------------------------+%n");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				accountFunction.showList();
				break;
			case 2:
				System.out.println("Tạo Account");
				break;
			case 3:
				System.out.println("Update account");
				break;

			case 5:
				accountFunction.findByID();
				break;
			case 10:
				return;
			default:
				System.out.println("Mời bạn chọn lại");
				break;
			}
		}
	}
}
