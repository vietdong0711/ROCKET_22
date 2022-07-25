package backend;

import java.util.ArrayList;

import entity.MyMath1;
import entity.Student;
import entity.Student1;

public class Exercise2 {

	public void question1() {
		MyMath1 math1 = new MyMath1();
		System.out.println(math1.sum(10));
	}
	
	public void question2() {
		ArrayList<Student1> ls = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			Student1 aStudent1 = new Student1("Dong");
			ls.add(aStudent1);
		}
		
		for (Student1 student1 : ls) {
			System.out.println(student1.toString());
		}
	}
}
