package entity;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

import javax.xml.crypto.Data;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private float point;
	private Date birth;
	private static int count = 0;

	public Student() {
		++count;
		this.id = count;
	}

	public Student(String name, float point) {
		++count;
		this.id = count;
		this.name = name;
		this.point = point;
		this.birth = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

//	public int compareTo(Student s) {
//		return this.name.compareTo(s.getName());
//	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", point=" + point + ", birth=" + birth + "]";
	}

	@Override
	public int compareTo(Student s) {
		int a = this.name.compareTo(s.getName());
		if (a == 0) {
			if (this.point > s.point) {
				return 1;
			} else if (this.point < point) {
				return -1;
			} else {
				return this.birth.compareTo(s.birth);
			}
		} else {
			return a;
		}
	}
	
}
