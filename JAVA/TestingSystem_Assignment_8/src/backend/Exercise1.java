package backend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import javax.xml.soap.SAAJResult;

import entity.Student;

public class Exercise1 {
	private ArrayList<Student> ls;
	private Set<Student> set;
	public Exercise1() {
		ls = new ArrayList<>();
		set = new HashSet<>();
	}

	public void searchStudentByID(int id) {
		int c = 0;
		for (Student student : ls) {
			if (student.getId() == id) {
				System.out.println(student.toString());
				c = 1;
				break;
			}
		}
		if (c == 0) {
			System.out.println("Không tìm thấy");
		}
	}

	public void searchStudentByName(String name) {
		int c = 0;
		for (Student student : ls) {
			if (student.getName().equals(name)) {
				System.out.println(student.toString());
				c = 1;
				break;
			}
		}
		if (c == 0) {
			System.out.println("Không tìm thấy");
		}
	}

	public void printStudentDoublicateName() {
		String name = "";
		Set<String> rs = new HashSet<>();
		for (int i = 0; i < ls.size() - 1; i++) {
			name = ls.get(i).getName();
			for (int j = i + 1; j < ls.size(); j++) {
				if (ls.get(j).getName().equals(name)) {
					rs.add(ls.get(j).getName());
				}
			}
		}
		System.out.println("Các người có trùng tên là: ");
		for (String s : rs) {
			System.out.print(s + "  ");
		}

	}

	public void deleteNameStudentById(int id) {
		int c = 0;
		for (Student student : ls) {
			if (student.getId() == id) {
				student.setName("");
				System.out.println("Đã xóa teen student có id= " + id);
				c = 1;
				break;
			}
		}
		if (c == 0) {
			System.out.println("Không có kết quả tương ứng");
		}
	}

	public void deleteStudentById(int id) {
		int c = 0;
		for (Student student : ls) {
			if (student.getId() == id) {
				ls.remove(student);
				System.out.println("Đã xóa student có id= " + id);
				c = 1;
				break;
			}
		}
		if (c == 0) {
			System.out.println("Không có kết quả tương ứng");
		}
	}

	public void printLs() {
		for (Student student : ls) {
			System.out.println(student.toString());
		}
	}

	public void question1() throws Exception {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			Student a = new Student();
			ls.add(a);
		}
		System.out.println("a) Tổng số phần tử là: " + ls.size());

		System.out.println("b) Phần tử thứ 4 là: ");
		if (4 > ls.size() - 1) {
			System.out.println("Không có ptu này");
		}

		System.out.println("c) Phần tử đầu và cuối của ds là: " + ls.get(0) + "\n" + ls.get((ls.size() - 1)));

		Student bStudent = new Student();
		bStudent.setName("a");
		ls.add(1, bStudent);
		System.out.println("d) Danh sách sau khi thêm vào đầu là: ");
		printLs();

		Student c = new Student();
		ls.add(c);
		System.out.println("e) Danh sách sau khi thêm vào cuối  là: ");
		printLs();

		for (int i = 0; i < ls.size() / 2; i++) {
			Student a = ls.get(i);
			Student b = ls.get((ls.size() - i - 1));
			ls.set(i, b);
			ls.set((ls.size() - i - 1), a);
		}
		System.out.println("f) Danh sách sau đảo ngược  là: ");
		printLs();

		System.out.print("g) Nhập id cần tìm kiếm: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		searchStudentByID(id);

		System.out.print("h) Nhập tên cần tìm kiếm: ");
		String name = scanner.nextLine();
		searchStudentByName(name);

		System.out.println("i) Các sinh viên có trùng tên là: ");
		printStudentDoublicateName();

		System.out.print("j) Nhập id cần xóa tên: ");
		int idn = scanner.nextInt();
		scanner.nextLine();
		deleteNameStudentById(idn);

		System.out.print("k) Nhập id cần xóa: ");
		int idd = scanner.nextInt();
		scanner.nextLine();
		deleteStudentById(idd);

		ArrayList<Student> studentCopies = new ArrayList<>();
		for (Student student : ls) {
			studentCopies.add(student);
		}

		System.out.println("l) Danh sách sau khi copi là: ");
		for (Student student : studentCopies) {
			System.out.println(student.toString());
		}
	}
	
	public void question2() {
		Stack<String> a = new Stack<>();
		a.push("Nguyễn Văn Nam");
		a.push("Nguyễn Văn Huyên");
		a.push("Trần Văn Nam");
		a.push("Nguyễn Văn A");
		Queue<String> b = new LinkedList<>();
		b.add("Nguyễn Văn Nam");
		b.add("Nguyễn Văn Huyên");
		b.add("Trần Văn Nam");
		b.add("Nguyễn Văn A");
		
		System.out.println("a) Danh sách học sinh theo thứ tự muộn đến sớm: ");
		int lenght = a.size();
		for (int i=0;i<lenght;i++) {
			System.out.println(a.pop()+"  ");
		}
		System.out.println("b) Danh sách học sinh theo thứ tự sớm đến muộn: ");
		int l = b.size();
		for (int i=0;i<l;i++) {
			System.out.println(b.poll()+"  ");
		}	
	}
	
	private void question6() {
		Map<Integer, String> lsst = new HashMap<>();
		lsst.put(1, "Đồng");
		lsst.put(2, "Nam");
		for (Map.Entry<Integer, String> i : lsst.entrySet()) {
			System.out.println("ID: "+i.getKey());
			System.out.println("Name: "+i.getValue());
		}
		
	}

	
}
