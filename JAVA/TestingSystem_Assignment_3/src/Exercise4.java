import java.util.Scanner;

import Entity.Group;

public class Exercise4 {

	public void question1() {
		System.out.println("Question 1:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String a = sc.nextLine();
		String[] ac = a.split(" ");
		int dem=0;
		for (String string : ac) {
			if (string.equals("")) {
				dem++;
			}
		}
		System.out.println(dem);
		System.out.println("Số từ có trong chuỗi là: "+(ac.length-dem));
		System.out.println("============");
	}
	
	public void question2() {
		System.out.println("Question 2:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi 1: ");
		String a = sc.nextLine();
		System.out.println("Nhập chuỗi 2: ");
		String b = sc.nextLine();
		String ab = a+b;
		System.out.println("Chuỗi 1 là: "+a);
		System.out.println("Chuỗi 2 là: "+b);
		System.out.println("Chuỗi sau khi nối là: "+ab);
		System.out.println("============");
	}
	
	public void question3() {
		System.out.println("Question 3:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		String a = sc.nextLine();
		String[] ac = a.split("");
		ac[0]= ac[0].toUpperCase();
		String ab="";
		for (String string : ac) {
			ab+=string;
		}
		System.out.println("Tên vừa nhập là: "+ab);
		System.out.println("============");
	}
	
	public void question4() {
		System.out.println("Question 4:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		String a = sc.nextLine();
		String[] ac = a.split("");
		for (int i = 0; i < ac.length; i++) {
			System.out.println("Kí tự thứ "+(i+1)+" là: "+ac[i]);
		}
		System.out.println("============");
	}
	
	public void question5() {
		System.out.println("Question 5:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ: ");
		String a = sc.nextLine();
		System.out.println("Nhập tên: ");
		String b = sc.nextLine();
		System.out.println("Họ và tên là: "+a+" "+b);
		System.out.println("============");
	}
	
	public void question6() {
		System.out.println("Question 6:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ và tên: ");
		String a = sc.nextLine();
		String[] ar = a.split(" ");
		String dem = "";
		for (int i = 1; i < ar.length-1; i++) {
			dem+= ar[i]+" ";
		}
		System.out.println("Họ  là: "+ar[0]);
		System.out.println("Tên đệm là: "+dem.trim());
		System.out.println("Họ  là: "+ar[ar.length-1]);
		System.out.println("============");
	}
	
	public void question7() {
		System.out.println("Question 7:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ và tên: ");
		String a = sc.nextLine();
		a.trim();
		System.out.println("a)Đã xóa khoảng trắng đầu cuối!");
		String[] ar = a.split(" ");
		String rString = "";
		for (String string : ar) {
			if (!string.equals("")) {
				rString+=string+" ";
			}
		}
		System.out.println(rString);
		String dem = "";
		for (int j = 0; j < ar.length; j++) {
			String[] aaa= ar[j].split("");
			aaa[0] = aaa[0].toUpperCase();
			String string = "";
			for (int i = 0; i < aaa.length; i++) {
				string+=aaa[i];
			}
			ar[j] = string;
			dem+=ar[j]+ " ";
		}
		
		System.out.println("b)Họ và tên là: "+dem);
		System.out.println("============");
	}
	
	public void question8(Group[] grs) {
		System.out.println("Question 8:");
		for (Group group : grs) {
			if (group.getGroupName().contains("Java")) {
				System.out.println(group.toString());
			}
		}
		System.out.println("============");
	}
	
	public void question9(Group[] grs) {
		System.out.println("Question 9:");
		for (Group group : grs) {
			if (group.getGroupName().equals("Java")) {
				System.out.println(group.toString());
			}
		}
		System.out.println("============");
	}
	
	public void question10(String a, String b) {
		System.out.println("Question 10:");
		String[] aa = a.split("");
		String[] bb = b.split("");
		int kt =0;
		if (aa.length == bb.length) {
			for (int i = 0; i < aa.length; i++) {
				if (!aa[i].equals(bb[aa.length-i-1])) {
					System.out.println("Đây ko phải dãy đảo ngược!");
					kt=1;
					break;
				}
			}
		}else {
			System.out.println("Đây ko phải dãy đảo ngược!");
		}
		if (kt==0) {
			System.out.println("Đây là dãy đảo ngược!");
		}
		System.out.println("============");
	}
	
	public void question11(String a) {
		System.out.println("Question 11:");
		String[] aa = a.split("");
		int dem=0;
		for (String string : aa) {
			if (string.equals("a")) {
				dem++;
			}
		}
		System.out.println("Số lần xuất hiện chữ a trong chuối là: "+dem);
		System.out.println("============");
	}
	
	public void question12(String a) {
		System.out.println("Question 12:");
		String[] aa = a.split("");
		String chuoi="";
		for (int i = aa.length-1; i >= 0; i--) {
			chuoi+=aa[i];
		}
		System.out.println("Chuỗi đảo ngược là: "+chuoi);
		System.out.println("============");
	}
	
	public void question13(String a) {
		System.out.println("Question 13:");
		String[] aa = a.split("");
		for (String string : aa) {
			char c  = string.charAt(0);
			if (c>='0' && c<='9') {
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
		System.out.println("============");
	}
	
	public void question14(String a, String b) {
		System.out.println("Question 13:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String abc = sc.nextLine();
		String[] aa = abc.split("");
		String gString="";
		for (String string : aa) {
			if (string.endsWith(a)) {
				string="";
				string=b;
			}
			gString+=string;
		}
		System.out.println("Dãy sau khi thay là:"+ gString);
		System.out.println("============");
	}
	
	public void question15(String a) {
		System.out.println("Question 13:");
		a.trim();
		String[] aa = a.split(" ");
		String gString="";
		for (int i = aa.length-1; i >=0; i--) {
			gString+=aa[i]+" ";
		}
		System.out.println("Dãy sau khi thay là:"+ gString.trim());
		System.out.println("============");
	}
	
	public void question16(String a, int n) {
		System.out.println("Question 13:");
		a.trim();
		String[] aa = a.split("");
		if (aa.length %n!=0) {
			System.out.println("KO");
		}
		System.out.println("============");
	}
	
	public void question17() {
		System.out.println("Question 13:");
		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("số");
		int x= sc.nextInt();
		System.out.println("chữ");
		String abc = scanner.nextLine();
		System.out.println("số");
		int z= sc.nextInt();
		System.out.println("chữ");
		String abcz = scanner.nextLine();
		System.out.println(x+" "+abc );
		System.out.println("============");
	}
	
	public static void main(String[] args) {
		Group[] grs = {};
		Exercise4 e = new Exercise4();
//		e.question1();
//		e.question2();
//		e.question3();
//		e.question4();
//		e.question5();
//		e.question6();
//1		e.question7();
//		e.question8(grs);
//		e.question9(grs);
//		e.question10("abc", "cba");
//		e.question11("abcbcbcbcbcc");
//		e.question12("abcd");
//		e.question13("aa");
//		e.question14("e", "*");
//		e.question15("Hello, I am Đồng");
//		e.question16("aaaaaaaaaa", 3);
		e.question17();
		
	}
}
