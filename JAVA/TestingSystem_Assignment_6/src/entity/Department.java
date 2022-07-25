package entity;

public class Department {
	private int DepartmentID;
	private String DepartmentName;
	public static int id=0;

	public Department() {
		id++;
		this.DepartmentID = id;
	}

	public Department(String departmentName) {
		id++;
		this.DepartmentID = id;
		DepartmentName = departmentName;
	}

	public int getDepartmentID() {
		return DepartmentID;
	}

	public void setDepartmentID(int departmentID) {
		DepartmentID = departmentID;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [DepartmentID=" + DepartmentID + ", DepartmentName=" + DepartmentName + "]";
	}
	
	

}
