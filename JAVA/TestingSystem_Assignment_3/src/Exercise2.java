import java.time.LocalDate;
import java.util.Scanner;

public class Exercise2 {
	
	public void question1() {
		Scanner sc= new Scanner(System.in);
		Account[] accounts;
		for (int i = 0; i < 5; i++) {
			Account acc = new Account();
			acc.setEmail("Email "+i);
			acc.setUsername("Username "+i);
			acc.setFullName("FullName "+i);
			acc.setCreateDate(LocalDate.now());
			
			System.out.println("Email: "+acc.getEmail()+", Username: "+acc.getUsername()+", Fullname: "+acc.getFullName()+", CreateDate: "+acc.getCreateDate());
		}
		
	}
	
	public static void main(String[] args) {
		Exercise2 e = new Exercise2();
		e.question1();
	}
}
