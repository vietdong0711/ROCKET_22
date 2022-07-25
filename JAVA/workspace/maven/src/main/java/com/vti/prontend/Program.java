package com.vti.prontend;

import java.sql.SQLException;

import com.vti.entiti.Role;
import com.vti.entiti.User;
import com.vti.utils.ScannerUtils;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		menuLogin();
	}

	private static void menuLogin() throws ClassNotFoundException, SQLException {
		Function function = new Function();

		System.out.println("MỜI BẠN LOGIN");
		User user = function.login();

		if (user.getRole() == Role.MANAGER) {
			menuManager();
		} else {
			System.out.println("Accout này là Employee không có quyền truy cập");
		}
	}

	private static void menuManager() throws ClassNotFoundException, SQLException {
		Function function = new Function();

		while (true) {
			System.out.println("Mời bạn nhập chức năng muốn sử dụng:\n" + "1: Tìm các Employee theo project ID\n"
					+ "2: Danh sách các Manager\n" + "3:Thoát.");
			System.out.println("\nMời bạn nhập tính năng: ");
			int choose = ScannerUtils.inputFunction(1, 3, "Bạn chỉ chọn từ 1 --> 3. Mời nhập lại!");

			switch (choose) {
			case 1:
				function.getEmployeeByProjectID();
				break;
			case 2:
				function.getManager();
				break;
			case 3:
				System.out.println("Bạn đã thoát khỏi chương trình!");
				return;
			}
		}
	}
}
