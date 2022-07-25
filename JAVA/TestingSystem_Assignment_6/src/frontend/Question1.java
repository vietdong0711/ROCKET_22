package frontend;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = scanner.nextInt();
		System.out.print("Enter b:");
		int b = scanner.nextInt();
		
		try {
			System.out.println("Resutl of the "+a+" for "+b+" is "+divide(a, b));
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide to 0");
		}
	}

	public static int divide(int a, int b) {
		
		return a / b;
	}

	
}
