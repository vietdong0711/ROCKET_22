package com.vti.frontend;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.vti.DAO.AccountDAO;
import com.vti.DAO.DepartmentDAO;
import com.vti.DAO.PositionDAO;
import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;

public class AccountFunction {

	private AccountDAO accountDAO;
	private DepartmentDAO departmentDAO;
	private PositionDAO positionDAO;

	public AccountFunction() {
		accountDAO = new AccountDAO();
		departmentDAO = new DepartmentDAO();
		positionDAO = new PositionDAO();
	}

	public void showList() {
		List<Account> listAccount = accountDAO.getListAccount();
		String leftAlignFormat = "| %-6d | %-21s |%n";
		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   ID   | Username              |%n");
		System.out.format("+--------+-----------------------+%n");
		for (Account a : listAccount) {
			System.out.format(leftAlignFormat, a.getId(), a.getDepartment().getName());
		}
		System.out.format("+--------+-----------------------+%n");
	}

	public void findByID() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID:");
		short id = sc.nextShort();
		sc.nextLine();
		Account account = accountDAO.getAccountByID(id);
		if (account == null) {
			System.out.println("Không có Accou có ID " + id);
		} else {
			System.out.println(account.getUserName());
		}
	}

	public void createAccout() {
		Scanner sc = new Scanner(System.in);
		Account account = new Account();

		System.out.println("Nhập thông tin Account:");
		System.out.print("Nhập email: ");
		String email = sc.nextLine();
		System.out.print("Nhập username: ");
		String username = sc.nextLine();
		System.out.print("Nhập fullname: ");
		String fullname = sc.nextLine();
		System.out.print("Chọn department: ");
		Department department = setDepartment();
		System.out.print("Chọn position: ");
		Position position = setPosition();

		account.setEmail(email);
		account.setUserName(username);
		account.setFullName(fullname);
		account.setDepartment(department);
		account.setPosition(position);

	}

	public Department setDepartment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chọn Department:");
		List<Department> ls = departmentDAO.getListDepartment();
		Map<Short, String> map = new HashMap<Short, String>();
		short key;

		for (Department department : ls) {
			System.out.println("Chọn " + department.getId() + ". " + department.getName());
		}
		key = sc.nextShort();

		return departmentDAO.getDepartmentByID(key);
	}

	public Position setPosition() {
		System.out.println("Chọn Position:");

		return null;
	}

	public <T> void prinSwichCase(Short key, Map<Short, String> ls) {
		System.out.format("switch(%s) {\n", key);
		for (int i = 0; i < ls.size(); i++) {
			System.out.format("case %d:\n %s \n  break;\n", key, ls.get(key));
		}
		System.out.println("case 0:\n  return;\n}");
		System.out.println("default:\n System.out.println(\"Moi chon lai\"); \n}");
	}

}
