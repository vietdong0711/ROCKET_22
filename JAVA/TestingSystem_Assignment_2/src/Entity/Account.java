package Entity;

import java.util.Date;

public class Account {
	public int accountID;
	public String emai;
	public String username;
	public String fullName;
	public Department department;
	public Position position;
	public Date createDate;
	public Group[] groups;
	
	
	
	public Account() {
		super();
	}
	public Account(int accountID, String emai, String username, String fullName, Department department,
			Position position) {
		super();
		this.accountID = accountID;
		this.emai = emai;
		this.username = username;
		this.fullName = fullName;
		this.department = department;
		this.position = position;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getEmai() {
		return emai;
	}
	public void setEmai(String emai) {
		this.emai = emai;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Group[] getGroups() {
		return groups;
	}
	public void setGroups(Group[] groups) {
		this.groups = groups;
	}
	
	
	
}
