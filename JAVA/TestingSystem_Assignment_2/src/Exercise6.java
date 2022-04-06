import java.text.SimpleDateFormat;
import java.util.Date;

import Entity.Account;

public class Exercise6 {

	public void Question1() {
		System.out.println("Question 1:");
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "  ");
			}
		}
		System.out.println();
	}

	public void Question2(Account[] a) {
		System.out.println("Question 2:");
		for (Account account : a) {
			System.out.println("AccountID: " + account.getAccountID() + " FullName: " + account.getFullName()
					+ "Email: " + account.getEmai() + "Username:" + account.getUsername());
			System.out.println();
		}
	}

	public void Question3() {
		System.out.println("Question 3:");
		for (int i = 1; i < 10; i++) {

			System.out.print(i + "  ");

		}
		System.out.println();
	}

	public static void main(String[] args) {
		Exercise6 e = new Exercise6();
		e.Question1();

		Account acc1 = new Account();
		acc1.accountID = 1;
		acc1.fullName = "Nguyễn Văn 1";
		acc1.emai = "1@gmail.com";
		acc1.username = "nv1";
		acc1.createDate = new Date(2022, 01, 01);

		Account acc2 = new Account();
		acc2.accountID = 2;
		acc2.fullName = "Nguyễn Văn 2";
		acc2.emai = "2@gmail.com";
		acc2.username = "nv2";
		acc2.createDate = new Date(2022, 01, 01);

		Account acc3 = new Account();
		acc3.accountID = 3;
		acc3.fullName = "Nguyễn Văn 3";
		acc3.emai = "3@gmail.com";
		acc3.username = "nv3";
		acc3.createDate = new Date(2022, 01, 01);

		Account[] accs = { acc1, acc2, acc3 };
		e.Question2(accs);

		e.Question3();
	}
}
