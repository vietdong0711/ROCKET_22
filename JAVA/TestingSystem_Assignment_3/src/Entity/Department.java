package Entity;

public class Department {
	public int DepartmentID;
	public String DepartmentName;
	public String address;
	
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
