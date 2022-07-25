package com.vti.backend.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.UserService;
import com.vti.entity.User;

public class UserController {

	private UserService userService;

	public UserController() {
		userService = new UserService();
	}

	public List<User> getListUsers() throws ClassNotFoundException, SQLException {
		return userService.getListUsers();
	}

	public User getUserById(int userId) throws ClassNotFoundException, SQLException {
		return userService.getUserById(userId);
	}

	public User login(String email, String password) throws ClassNotFoundException, SQLException {
		return userService.login(email, password);
	}

	public boolean deleteUserExistsById(int userId) throws ClassNotFoundException, SQLException {
		return userService.deleteUserExistsById(userId);
	}

	public boolean isUserExistsByEmail(String email) throws ClassNotFoundException, SQLException {
		return userService.isUserExistsByEmail(email);
	}

	public void createUser(String fullname, String email) throws ClassNotFoundException, SQLException {
		userService.createUser(fullname, email);
	}
}
