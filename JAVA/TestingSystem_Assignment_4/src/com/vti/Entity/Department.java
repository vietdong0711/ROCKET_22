package com.vti.Entity;

public class Department {
	private int DepartmentID;
	private String DepartmentName;

	public Department() {

	}

	public Department(String departmentName) {
		DepartmentID = 0;
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
