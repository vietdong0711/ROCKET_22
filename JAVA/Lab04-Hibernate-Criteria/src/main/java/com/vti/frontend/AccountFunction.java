package com.vti.frontend;

import java.util.List;
import java.util.Scanner;

import com.vti.DAO.AccountDAO;
import com.vti.entity.Account;

public class AccountFunction {

	private AccountDAO accountDAO;

	public AccountFunction() {
		accountDAO = new AccountDAO();
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

	public void findAccountByID() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID:");
		short id = sc.nextShort();
		sc.nextLine();
		Account account = accountDAO.getAccountByID(id);
		if (account == null) {
			System.out.println("Không có Account có ID " + id);
		} else {
			System.out.println(account.getId() + " " + account.getEmail() + " " + account.getUserName() + " "
					+ account.getFullName() + " " + account.getDepartment().getName() + " "
					+ account.getPosition().getName() + " " + account.getCreateDate());
		}
	}

	public void findFullNameByID() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID:");
		short id = sc.nextShort();
		sc.nextLine();
		String string = accountDAO.getFullNameByID(id);
		if (string == null) {
			System.out.println("Không có Account có ID " + id);
		} else {
			System.out.println("Fullname của ID " + id + " là " + string);
		}
	}

	public void getAccountCurrMonth() {
		System.out.println("DS các account đc tạo trong tháng này là");
		List<Account> listAccount = accountDAO.getAccountCurrMonth();

		String leftAlignFormat = "| %-6d | %-21s |%n";
		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   ID   | Username              |%n");
		System.out.format("+--------+-----------------------+%n");
		for (Account a : listAccount) {
			System.out.format(leftAlignFormat, a.getId(), a.getUserName());
		}
		System.out.format("+--------+-----------------------+%n");
	}

	public void getListCountAccountCurrMonth() {
		System.out.println("Thống kê số lượng account tạo trong mỗi tháng");
		List<Object[]> listAccount = accountDAO.getListCountAccountCurrMonth();

		String leftAlignFormat = "| %-6d | %-21s |%n";
		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   month| SL                    |%n");
		System.out.format("+--------+-----------------------+%n");
		for (Object[] a : listAccount) {
			System.out.format(leftAlignFormat, a[0], a[1]);
		}
		System.out.format("+--------+-----------------------+%n");
	}

	public void getListCountAccountCurrMonthHaving3() {
		System.out.println("Thống kê số lượng account tạo trong mỗi tháng và có số acccount >=3");
		List<Object[]> listAccount = accountDAO.getListCountAccountCurrMonthHaving3();

		String leftAlignFormat = "| %-6d | %-21s |%n";
		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   month| SL                    |%n");
		System.out.format("+--------+-----------------------+%n");
		for (Object[] a : listAccount) {
			System.out.format(leftAlignFormat, a[0], a[1]);
		}
		System.out.format("+--------+-----------------------+%n");
	}

}
