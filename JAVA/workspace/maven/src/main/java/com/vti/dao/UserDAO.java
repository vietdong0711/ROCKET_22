package com.vti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entiti.Employee;
import com.vti.entiti.Manager;
import com.vti.entiti.User;
import com.vti.utils.JDBCUtils;

public class UserDAO {

	private JDBCUtils jdbcUtils;

	public UserDAO() {
		jdbcUtils = new JDBCUtils();
	}

	public List<Employee> getEmployeeByProjectID(int pjId) throws SQLException, ClassNotFoundException {
		List<Employee> ls = new ArrayList<>();
		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();

			// Step 2: Create a statement obiect
			String sql = "SELECT UserID, FullName, Email, Role, ExpInYear, ProSkill,ProjectID  FROM `User` WHERE ProjectID = ? and Role = 'Employee' ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, pjId);

			// Step 3: Execute SQL query
			ResultSet resultSet = statement.executeQuery();

			// Step 4: Handling Result Set
			while (resultSet.next()) {
				int id = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				String email = resultSet.getString("Email");
				int projectId = resultSet.getInt("ProjectID");
				String proSkill = resultSet.getString("proSkill");

				Employee employee = new Employee(id, fullName, email, projectId, proSkill);

				ls.add(employee);

			}
			return ls;

		} finally {
			jdbcUtils.disconnect();
		}
	}

	public List<Manager> getManager() throws SQLException, ClassNotFoundException {
		List<Manager> ls = new ArrayList<>();
		try {
			// Step 1: get connection
			Connection connection = jdbcUtils.getConnection();

			// Step 2: Create a statement obiect
			String sql = "SELECT UserID, FullName, Email, Role, ExpInYear, ProSkill,ProjectID  FROM `User` WHERE `Role` = 'Manager' ";
			PreparedStatement statement = connection.prepareStatement(sql);

			// Step 3: Execute SQL query
			ResultSet resultSet = statement.executeQuery();

			// Step 4: Handling Result Set
			while (resultSet.next()) {
				int id = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				String email = resultSet.getString("Email");
				int projectId = resultSet.getInt("ProjectID");
				int expInYear = resultSet.getInt("expInYear");

				Manager mana = new Manager(id, fullName, email, expInYear, projectId);

				ls.add(mana);

			}
			return ls;

		} finally {
			jdbcUtils.disconnect();
		}
	}

	public User login(String email, String password) throws SQLException, ClassNotFoundException {

		
			Connection connection = jdbcUtils.getConnection();

			String sql = "SELECT UserID, FullName, Role FROM `User` WHERE Email = ? AND `Password` = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			statement.setString(2, password);

			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				String role = resultSet.getString("Role");

				if (role.equals("Manager")) {
					User manager = new Manager(id, fullName, "", 0, 0);
					return manager;
				} else {
					User employee = new Employee(id, fullName, "", 0, "");
					return employee;
				}
			
			}
			return null;
	}
	

}
