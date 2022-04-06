import java.nio.file.attribute.FileOwnerAttributeView;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

	public void question1() {
		float acc1 = 5240.5f;
		float acc2 = 10970.055f;
		int accc1 = (int) acc1;
		int accc2 = (int) acc2;
		System.out.println("Sau khi làm tròn là: " + accc1 + " " + accc2);
	}

	public void question2() {
		Random random = new Random();
		int rd = random.nextInt(99999);
		String so0 = "";

		if (rd < 10) {
			so0 = "0000";
		} else if (rd < 100) {
			so0 = "000";
		} else if (rd < 1000) {
			so0 = "00";
		} else if (rd < 10000) {
			so0 = "0";
		} else {
			so0 = "";
		}

		System.out.println("Số vừa random là: " + so0 + rd);
	}
	
	public void question3() {
		Random random = new Random();
		int rd = random.nextInt(99999);

		System.out.println("Hai số cuối là: " + rd%100);
	}
	
	public void question4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số thứ 1: ");
		int a = sc.nextInt();
		System.out.println("Nhập số thứ 2: ");
		int b = sc.nextInt();

		System.out.println("Thương của "+a+" và "+b+" là: " + (float) a/b);
	}
	

	public static void main(String[] args) {
		Exercise1 e = new Exercise1();
		e.question1();
		e.question2();
		e.question3();
		e.question4();
	}
}
