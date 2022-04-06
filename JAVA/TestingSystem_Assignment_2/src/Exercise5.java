import java.time.LocalDate;
import java.util.Scanner;

public class Exercise5 {

	public void Question5() {
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Question 1:
		System.out.println("Question 1: Nhập 3 số nguyên ");
		System.out.println("Nhập số thứ 1: ");
		int a = sc.nextInt();
		System.out.println("Nhập số thứ 2: ");
		int b = sc.nextInt();
		System.out.println("Nhập số thứ 3: ");
		int c = sc.nextInt();
		System.out.println(a+" "+b+" "+c);

		// Question 2:
		System.out.println("\nQuestion 2: Nhập 2 số thực");
		System.out.println("Nhập số thứ 1: ");
		float d = sc.nextFloat();
		System.out.println("Nhập số thứ 2: ");
		float e = sc.nextInt();
		System.out.println(d+" "+e);
		
		// Question 3:
		System.out.println("\nQuestion 3: Nhập họ và tên ");
		String name = sc.next();
		System.out.println(name);
		
		// Question 4:
		System.out.println("\nQuestion 4: Nhập vào ngày sinh");
		System.out.println("Nhập năm: ");
		int y = sc.nextInt();
		System.out.println("Nhập tháng: ");
		int m = sc.nextInt();
		System.out.println("Nhập ngày: ");
		int dd = sc.nextInt();
		
		LocalDate  localDate = LocalDate.of(y, m, dd);
		System.out.println("Ngày sinh là: "+localDate);
		// Question 5:
		System.out.println("\nQuestion 5: Tạo account ");
		
		// Question 6:
		System.out.println("\nQuestion 6: Tạo derpatment");

		// Question 7:
		System.out.println("\nQuestion 7: Nhập số chẵn");

		// Question 8:
		System.out.println("\nQuestion 8: Viết chương trình");

		// Question 9:
		System.out.println("\nQuestion 9: ");

		// Question 10:
		System.out.println("\nQuestion 10: ");

		// Question 11:
		System.out.println("\nQuestion 11: ");

	}
}
