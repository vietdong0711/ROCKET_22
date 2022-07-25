package com.vti.prontend;

import java.sql.SQLException;
import java.util.List;

import com.vti.controller.UserController;
import com.vti.entiti.Employee;
import com.vti.entiti.Manager;
import com.vti.entiti.User;
import com.vti.utils.ScannerUtils;

public class Function {

	private UserController userController;

	public Function() {
		userController = new UserController();
	}

	public void getEmployeeByProjectID() throws ClassNotFoundException, SQLException {
		System.out.print("Mời bạn nhập Project ID: ");
		int projectId = ScannerUtils.inputPositiveInt("Bạn phải nhập vào số nguyên dương! Mời nhập lại");
		List<Employee> ls = userController.getEmployeeByProjectID(projectId);
		System.out.println("Danh sách các Employee có Project ID = " + projectId);
		System.out.printf("%-15s %-25s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "ProjectID", "ProSkill");
		for (Employee user : ls) {
			System.out.printf("%-15s %-25s %-25s %-25d %-25s \n", user.getId(), user.getEmail(), user.getFullName(),
					user.getProjectId(), user.getProSkill());
		}
	}

	public void getManager() throws ClassNotFoundException, SQLException {
		System.out.println("");
		List<Manager> ls = userController.getManager();
		System.out.println("Danh sách các Manager là");
		System.out.printf("%-15s %-25s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "ProjectID", "Exp In Year");
		for (Manager user : ls) {
			System.out.printf("%-15s %-25s %-25s %-25d %-25d\n", user.getId(), user.getEmail(), user.getFullName(),
					user.getProjectId(), user.getExpInYear());
		}
	}

	public User login() throws ClassNotFoundException, SQLException {
		while (true) {
			System.out.print("Nhập vào Email: ");
			String email = ScannerUtils.inputEmail("Email chưa đúng định dạng.");

			System.out.print("Nhập password: ");
			String password = ScannerUtils.inputPassword("Password phai dai tu 6--> 12 ki tu!");

			User user = userController.login(email, password);

			if (user != null) {
				System.out.printf("Chào mừng %s (%s) \n \n \n", user.getFullName(), user.getRole());
				return user;
			} else {
				System.err.println("Bạn đã điền Email/Password không đúng! Mời bạn nhập lại!");
			}
		}
	}
}
