import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import Entity.Account;
import Entity.Group;

public class Exercise2 {

	public static void main(String[] args) {
		//Question 1 
		int a = 5;
		System.out.println("Question 1:           "+a);
		
		//Question 2
		int b =100000000;
		DecimalFormat decimalFormat = new DecimalFormat("###,###");
		String bb = decimalFormat.format(b);
		
		System.out.println("Question 2:      "+bb);
		
		//Question 3
		DecimalFormat decimalFormat1 = new DecimalFormat("###.####");
		float c = 5.567098f;
		String cc = decimalFormat1.format(c);
		System.out.println("Question 3:     "+cc);
		
		//Question 4 
		String name = "Nguyễn Văn A";
		System.out.println("Question 4:      "+"Tôi tên là "+name+" và tôi đang độc thân");
		
		//Question 5
		SimpleDateFormat dateFormat=  new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println("Question 5:      "+ dateFormat.format(date));
		
		//Question 6
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
		
		SimpleDateFormat dateFormat1=  new SimpleDateFormat("dd-mm-yyyy");
		Account[] accs = {acc1, acc2, acc3};
		System.out.println("Question 6:");
		System.out.println("           ");
		for (Account acc : accs) {
			System.out.printf("%-5s %-30s %-30s %-20s %-30s  \n", String.valueOf(acc.getAccountID()), acc.getFullName(), acc.getEmai(), String.valueOf(dateFormat1.format(acc.getCreateDate())));
		}
		
	}
}
