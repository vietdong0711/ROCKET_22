package com.vti.controller;

import java.sql.SQLException;
import java.util.List;

import com.vti.entiti.Employee;
import com.vti.entiti.Manager;
import com.vti.entiti.User;
import com.vti.service.UserService;

public class UserController {

	private UserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	
	public List<Employee> getEmployeeByProjectID(int projectId) throws ClassNotFoundException, SQLException{
		return userService.getEmployeeByProjectID(projectId);
	}
	
	public List<Manager> getManager() throws ClassNotFoundException, SQLException{
		return userService.getManager();
	}
	
	public User login(String email, String password) throws ClassNotFoundException, SQLException {
		return userService.login(email, password);
	}
}
