import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {

	public static void main(String[] args) {
		//Question 1
		System.out.println("Question 1:");
		Random random = new Random();
		int c1 = random.nextInt();
		System.out.println("Số nguyên ngẫu nhiên là "+c1);
		
		//Question 2
		System.out.println("\nQuestion 2:");
		float c2 = random.nextFloat();
		System.out.println("Số thực ngẫu nhiên là "+c2);
		
		//Question 3
		System.out.println("\nQuestion 3:");
		String[] strings = {"Đồng","Hằng","Ngáo"};
		int c3 = random.nextInt(strings.length-1);
		System.out.println("Bạn ngẫu nhiên trong lớp là:  "+strings[c3]);
		
		//Question 4
		System.out.println("\nQuestion 4:");
		int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		long c4 = minDay+ random.nextInt(maxDay-minDay);
		LocalDate rs = LocalDate.ofEpochDay(c4);
		System.out.println("Ngày trong khoảng đó là "+rs);
		
		//Question 5
		System.out.println("\nQuestion 5:");
		int minDay1 = (int) LocalDate.now().toEpochDay();
		
		long c5 = minDay1 -  random.nextInt(365);
		LocalDate rs1 = LocalDate.ofEpochDay(c5);
		System.out.println("Ngày trong khoảng 1 năm là "+rs1);
		
		//Question 6
		System.out.println("\nQuestion 6:");
		System.out.println("Một ngày trong quá khứ là: "+LocalDate.ofEpochDay(random.nextInt(minDay1)));
		
		//Question 7
		System.out.println("\nQuestion 7:");
		System.out.println("Số ngẫu nhiên có 3 chữ số là "+ (100+random.nextInt(899)));
	}
	
}
