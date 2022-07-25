package com.vti.entiti;

public class Employee extends User {

	private int projectId;
	private String proSkill;
	public Employee(int id, String fullName, String email, int projectId, String proSkill) {
		super(id, fullName, email, Role.EMPLOYEE);
		this.projectId = projectId;
		this.proSkill = proSkill;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullName=" + fullName + ", email=" + email + "projectId=" + projectId + ", proSkill=" + proSkill + "]";
	}
	
}
