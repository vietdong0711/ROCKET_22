package com.vti.entiti;

public class Manager extends User {
	private int projectId;
	private int expInYear;
	

	public Manager(int id, String fullName, String email, int expInYear, int projectId) {
		super(id, fullName, email, Role.MANAGER);
		this.expInYear = expInYear;
		this.projectId = projectId;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", fullName=" + fullName + ", email=" + email + "expInYear=" + expInYear + ", projectId=" + projectId + "]";
	}
	
	

}
