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
			System.out.format(leftAlignFormat, "6. Find FullName By ID");
			System.out.format(leftAlignFormat, "7. Find FullName By ID");
			System.out.format(leftAlignFormat, "8. get count account in every month");
			System.out.format(leftAlignFormat, "9. get count account in every month and >= 3 account");
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
				accountFunction.findAccountByID();
				break;
			case 6:
				accountFunction.findFullNameByID();
				break;
			case 7:
				accountFunction.getAccountCurrMonth();
				break;
			case 8:
				accountFunction.getListCountAccountCurrMonth();
				break;
			case 9:
				accountFunction.getListCountAccountCurrMonthHaving3();
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
