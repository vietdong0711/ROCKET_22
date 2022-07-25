package com.vti.service;

import java.sql.SQLException;
import java.util.List;

import com.vti.dao.UserDAO;
import com.vti.entiti.Employee;
import com.vti.entiti.Manager;
import com.vti.entiti.User;


public class UserService {
 
	private UserDAO userDao;
	
	public UserService() {
		userDao = new UserDAO();
	}
	
	public List<Employee> getEmployeeByProjectID(int projectId) throws ClassNotFoundException, SQLException{
		return userDao.getEmployeeByProjectID(projectId);
	}

	public List<Manager> getManager() throws ClassNotFoundException, SQLException{
		return userDao.getManager();
	}
	
	public User login(String email, String password) throws ClassNotFoundException, SQLException {
		return userDao.login(email, password);
	}
	
}
