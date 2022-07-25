package backend;

import java.util.Scanner;

import entity.Account;

public class Question12 {

	public int inputAge() {

		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter age: ");
				int age = scanner.nextInt();
				
				if (age <18) {
					System.out.println("Wrong inputing! The age must be greater than 18, please input again!");
					//scanner.close();
				} else {
					return age;
				}
				
			} catch (Exception e) {
				System.out.println("Wrong inputing! Please input an age as int, input again!");
				continue;
			}
		}
	}
	
	public void inputAccount() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter full name: ");
		String fullName = scanner.nextLine();
		System.out.print("Enter email: ");
		String email = scanner.nextLine();
		System.out.print("Enter age: ");
		int age = inputAge();
		Account account = new Account(age, fullName, email);
		
	}
	
	
}
