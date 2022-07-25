package com.vti.frontend;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		DepartmentFunction departmentFunction = new DepartmentFunction();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.println("------MỜI BẠN CHỌN CHỨC NĂNG------");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                        Choose please                                     |%n");

			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Danh sách phòng ban");
			System.out.format(leftAlignFormat, "2. Tạo Department");
			System.out.format(leftAlignFormat, "3. Update Department");
			System.out.format(leftAlignFormat, "4. Delete Department");
			System.out.format(leftAlignFormat, "10. Exit");
			System.out.format("+--------------------------------------------------------------------------+%n");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				departmentFunction.showDepartments();
				break;
			case 2:
				departmentFunction.createDepartment();

				break;
			case 3:
				departmentFunction.updateDepartment();
				break;
			case 4:
				departmentFunction.deleteDepartment();
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
