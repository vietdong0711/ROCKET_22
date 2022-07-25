package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.User;

public class UserService {

	private UserRepository userRepository;

	public UserService() {
		userRepository = new UserRepository();
	}

	public List<User> getListUsers() throws ClassNotFoundException, SQLException {
		return userRepository.getListUsers();
	}

	public User getUserById(int userId) throws ClassNotFoundException, SQLException {
		return userRepository.getUserById(userId);
	}

	public boolean deleteUserExistsById(int userId) throws ClassNotFoundException, SQLException {
		return userRepository.deleteUserExistsById(userId);
	}

	public User login(String email, String password) throws ClassNotFoundException, SQLException {
		return userRepository.login(email, password);
	}

	public boolean isUserExistsByEmail(String email) throws ClassNotFoundException, SQLException {
		return userRepository.isUserExistsByEmail(email);
	}

	public void createUser(String fullname, String email) throws ClassNotFoundException, SQLException {
		userRepository.createUser(fullname, email);
	}
}
