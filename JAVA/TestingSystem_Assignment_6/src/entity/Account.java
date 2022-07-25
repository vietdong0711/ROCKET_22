package entity;

public class Account {

	public int age;
	public String fullName;
	public String emai;

	public Account() {

	}

	public Account(int age, String fullName, String emai) {
		super();
		this.age = age;
		this.fullName = fullName;
		this.emai = emai;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
	}

}
