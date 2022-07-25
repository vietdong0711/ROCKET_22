package entity;

public class Student {

	private int id;
	private String name;
	public static String college;
	public static int moneyGroup;
	public static int count=0;

	public Student() {
		++count;
		if (count>7) {
			System.out.println("Không được tạo quá 7 student");
		}else {
			college = "Đại học bách khoa";
		}
		
	}

	public Student(int id, String name) {
		++count;
		if (count>7) {
			System.out.println("Không được tạo quá 7 student");
		}else {
			college = "Đại học bách khoa";
			this.id = id;
			this.name = name;
		}
		
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

	public int getMoneyGroup() {
		return moneyGroup;
	}

	public void setMoneyGroup(int moneyGroup) {
		this.moneyGroup = moneyGroup;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college= " + college + "]";
	}

}
