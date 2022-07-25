package entity;

public class Student1 {

	private final int id = 1;
	private String name;

	public Student1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + "]";
	}

	private final void study() {
		System.out.println("Đang học bài....");
	}
}
