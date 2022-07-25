package backend;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import entity.HinhChuNhat;
import entity.HinhHoc;
import entity.HinhTron;
import entity.MyMath;
import entity.PrimaryStudent;
import entity.SecondaryStudent;
import entity.Student;

public class Exercise1 {

	public void question1() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> ls = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Nhập thông tin học sinh thứ " + (i + 1));
			System.out.print("Nhập tên: ");
			String name = scanner.nextLine();
			Student aStudent = new Student(i + 1, name);
			ls.add(aStudent);
		}
		System.out.println("Danh sách vừa nhập là:");
		for (Student student : ls) {
			System.out.println(student.toString());
		}

		System.out.println("=== Chuyển trường ===");
		for (Student student : ls) {
			student.college = "Đại học công nghê";
		}
		System.out.println("Danh sách sau khi sửa là:");
		for (Student student : ls) {
			System.out.println(student.toString());
		}

	}

	public void question2() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> ls = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Nhập thông tin học sinh thứ " + (i + 1));
			System.out.print("Nhập tên: ");
			String name = scanner.nextLine();
			Student aStudent = new Student(i + 1, name);
			ls.add(aStudent);
		}
		System.out.println("Mỗi sinh viên nộp 100k");
		Student.moneyGroup += ls.size() * 100;
		System.out.println("Tổng quỹ: " + Student.moneyGroup);
		System.out.println("Sinh viên 1 lấy 50k đi mua bim bim");
		System.out.println("Tổng quỹ: " + (Student.moneyGroup -= 50));
		System.out.println("Sinh viên 2 lấy 20k đi mua bim bim");
		System.out.println("Tổng quỹ: " + (Student.moneyGroup -= 20));
		System.out.println("Sinh viên 3 lấy 150k đi mua bim bim");
		System.out.println("Tổng quỹ: " + (Student.moneyGroup -= 150));
		System.out.println("Mỗi sinh viên nộp 50k");
		Student.moneyGroup += ls.size() * 50;
		System.out.println("Tổng quỹ: " + Student.moneyGroup);
	}

	public void question3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a= ");
		int a = scanner.nextInt();
		System.out.print("Nhập b= ");
		int b = scanner.nextInt();
		System.out.println("Max " + a + " và " + b + ": " + MyMath.max(a, b));
		System.out.println("Min " + a + " và " + b + ": " + MyMath.min(a, b));
		System.out.println("Sum " + a + " và " + b + ": " + MyMath.sum(a, b));
	}

	public void question4() {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student(1, "dong");
		System.out.print("Nhập college cần sửa: ");
		student.setCollege(scanner.nextLine());
		System.out.println();
		System.out.print("college là: " + student.getCollege());
	}
	
	public void question5() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> ls = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Nhập thông tin học sinh thứ " + (i + 1));
			Student aStudent = new Student(i + 1, " ");
			ls.add(aStudent);
		}
		
		Student a = new Student(4, " ");
		System.out.println("Số sinh viên đã được sinh ra là:"+ Student.count);
	}
	public void question6() {
		Student aStudent = new PrimaryStudent();
		Student bStudent = new PrimaryStudent();
		Student cStudent = new SecondaryStudent();
		Student dStudent = new SecondaryStudent();
		Student eStudent = new SecondaryStudent();
		Student fStudent = new SecondaryStudent();
		
		System.out.println("Số Student đã được sinh ra là:"+ Student.count);
		System.out.println("Số Primary Student đã được sinh ra là:"+ PrimaryStudent.d);
		System.out.println("Số Secondary Student đã được sinh ra là:"+ SecondaryStudent.c);
	}
	
	public void question7() {
		for (int i = 0; i < 10; i++) {
			Student st = new Student();
		}
	}
	
	public void question8() throws Exception {
		for (int i = 0; i < 3; i++) {
			HinhHoc aHinhHoc = new HinhChuNhat(2, 2);
		}
		for (int i = 0; i < 3; i++) {
			HinhHoc aHinhHoc = new HinhTron(2);
		}
		
	}
	
	
	
}
