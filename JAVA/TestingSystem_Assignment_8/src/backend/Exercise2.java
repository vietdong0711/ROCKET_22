package backend;

import java.util.ArrayList;
import java.util.Collections;

import entity.Student;

public class Exercise2 {
	
	public void question1() {
		
		ArrayList<Student> lStudents = new ArrayList<Student>();
		for (int i = 0; i < 5; i++) {

			Student s = new Student("Đồng", 5-i );
			lStudents.add(s);
		}
		Collections.sort(lStudents);

		for (Student student : lStudents) {
			System.out.println(student.toString());
		}
	}
}

