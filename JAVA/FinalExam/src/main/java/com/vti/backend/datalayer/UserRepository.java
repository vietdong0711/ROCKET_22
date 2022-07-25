package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Admin;
import com.vti.entity.Employee;
import com.vti.entity.User;
import com.vti.utils.JDBCUtils;

public class UserRepository {

	private JDBCUtils jdbcUtils;

	public UserRepository() {
		jdbcUtils = new JDBCUtils();
	}

	public List<User> getListUsers() throws ClassNotFoundException, SQLException {

		List<User> users = new ArrayList<>();

		// Step 1: get connection
		Connection connection = jdbcUtils.getConnection();

		// Step 2: Create a statement obiect
		Statement statement = connection.createStatement();

		// Step 3: Execute SQL query
		String sql = "SELECT UserID, FullName, Email FROM `User` ORDER BY UserID ASC";
		ResultSet resultSet = statement.executeQuery(sql); // for select

		// Step 4: Handling Result Set
		while (resultSet.next()) {
			User user = new User(
					resultSet.getInt("UserID"), 
					resultSet.getString("FullName"),
					resultSet.getString("Email"));

			users.add(user);
		}

		jdbcUtils.disconnect();

		return users;
	}

	public User getUserById(int userId) throws SQLException, ClassNotFoundException {

		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();
	
			// Step 2: Create a statement obiect
			String sql = "SELECT UserID, FullName, Email, Role, ExpInYear, ProSkill FROM `User` WHERE UserID = ? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, userId);
	
			// Step 3: Execute SQL query
			ResultSet resultSet = statement.executeQuery();
	
			// Step 4: Handling Result Set
			if (resultSet.next()) {
				int id = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				String email = resultSet.getString("Email");
				String role = resultSet.getString("Role");
	
				if (role.equals("Admin")) {
					int expInYear = resultSet.getInt("ExpInYear");
					User admin = new Admin(id, fullName, email, expInYear);
					return admin;
				} else {
					String proSkill = resultSet.getString("ProSkill");
					User employee = new Employee(id, fullName, email, proSkill);
					return employee;
				}
			} else {
				return null;
			}
		} finally {
			jdbcUtils.disconnect();
		}
	}
	
	public boolean deleteUserExistsById(int userId) throws SQLException, ClassNotFoundException {
		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();
	
			// Step 2: Create a statement obiect
			String sql = "DELETE FROM `User` WHERE UserID = ? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, userId);
	
			// Step 3: Execute SQL query
			int affect_records = statement.executeUpdate();
	
			// Step 4: Handling Result Set
			if (affect_records > 0) {
				return true;
			} else {
				return false;
			}
		} finally {
			jdbcUtils.disconnect();
		}
	}

	public User login(String email, String password) throws SQLException, ClassNotFoundException {
		
		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();
	
			// Step 2: Create a statement obiect
			String sql = "SELECT UserID, FullName, Role FROM `User` WHERE Email = ? AND `Password` = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			statement.setString(2, password);
	
			// Step 3: Execute SQL query
			ResultSet resultSet = statement.executeQuery();
	
			// Step 4: Handling Result Set
			if (resultSet.next()) {
				int id = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				String role = resultSet.getString("Role");
	
				if (role.equals("Admin")) {
					User admin = new Admin(id, fullName, email);
					return admin;
				} else {
					User employee = new Employee(id, fullName, email);
					return employee;
				}
			} else {
				return null;
			}
		} finally {
			jdbcUtils.disconnect();
		}
	}

	
	public boolean isUserExistsByEmail(String email) throws SQLException, ClassNotFoundException {

		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();
	
			// Step 2: Create a statement obiect
			String sql = "SELECT 1 FROM `User` WHERE Email = ? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
	
			// Step 3: Execute SQL query
			ResultSet resultSet = statement.executeQuery();
	
			// Step 4: Handling Result Set
			if (resultSet.next()) {
				return true;
			} else {
				return false;
			}
		} finally {
			jdbcUtils.disconnect();
		}
	}

	public void createUser(String fullname, String email) throws SQLException, ClassNotFoundException {
		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();
	
			// Step 2: Create a statement obiect
			String sql = "INSERT INTO `User`  (FullName	, 	Email	,	`Password`	,	ExpInYear	, 	ProSkill	, 	`Role`		)" +
						 "VALUES		      (		?	,	  ?		, 	'123456'	,		null	,	  null		,  'Employee'	)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, fullname);
			statement.setString(2, email);
			
			// Step 3: Execute SQL query
			statement.executeUpdate();
			
		} finally {
			jdbcUtils.disconnect();
		}
	}
}
