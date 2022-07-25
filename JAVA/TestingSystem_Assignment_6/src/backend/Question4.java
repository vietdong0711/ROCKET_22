package backend;

import java.util.ArrayList;

import entity.Department;

public class Question4 {
	private ArrayList<Department> ls;

	public Question4() {
		ls = new ArrayList<>();
	}
	
	public void test() {
		for (int i = 0; i < 3; i++) {
			Department department = new Department(null);
			ls.add(department);
		}
	}
	
	public void getIndex(int index) {
		System.out.println(ls.get(index).toString());
	}
}
