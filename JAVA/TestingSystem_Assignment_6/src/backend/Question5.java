package backend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question5 {

	public void inputAge() {

		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter age: ");
				int age = scanner.nextInt();
				
				if (age <= 0) {
					System.out.println("Wrong inputing! The age must be greater than 0, please input again!");
					//scanner.close();
				} else {
					System.out.println("Age entered is " + age);
					return;
				}
				
			} catch (Exception e) {
				System.out.println("Wrong inputing! Please input an age as int, input again!");
				continue;
			}
		}

	}
}
