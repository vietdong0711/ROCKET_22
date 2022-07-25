package com.vti.Entity;

import java.util.Arrays;
import java.util.Date;

public class Account {
	private int accountID;
	private String emai;
	private String username;
	private String fullName;
	private Department department;
	private Position position;
	private Date createDate;
	private Group[] groups;

	public Account() {

	}

	public Account(int accountID, String emai, String username, String firstName, String lastName) {
		this.accountID = accountID;
		this.emai = emai;
		this.username = username;
		this.fullName = firstName+" "+lastName;
	}

	
	
	public Account(int accountID, String emai, String username, String firstName, String lastName, Position position) {
		super();
		this.accountID = accountID;
		this.emai = emai;
		this.username = username;
		this.fullName = firstName+" "+lastName;
		this.position = position;
		this.createDate = new Date();
	}
	
	

	public Account(int accountID, String emai, String username, String firstName, String lastName, Position position, Date createDate) {
		super();
		this.accountID = accountID;
		this.emai = emai;
		this.username = username;
		this.fullName = firstName+" "+lastName;
		this.position = position;
		this.createDate = createDate;
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

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", emai=" + emai + ", username=" + username + ", fullName="
				+ fullName + ", department=" + department + ", position=" + position + ", createDate=" + createDate
				+ ", groups=" + Arrays.toString(groups) + "]";
	}

}
