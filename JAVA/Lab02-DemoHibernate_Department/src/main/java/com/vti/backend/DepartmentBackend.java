package com.vti.backend;

import java.util.List;

import com.vti.dao.DepartmentDAO;
import com.vti.entity.Department;

public class DepartmentBackend {
	private DepartmentDAO departmentDAO;

	public DepartmentBackend() {
		departmentDAO = new DepartmentDAO();
	}

	public List<Department> getListDepartment() {
		return departmentDAO.getListDepartment();
	}

	public Department getDepartmentByID(short id) {
		return departmentDAO.getDepartmentByID(id);
	}

	public void createDepartment(Department department) {
		departmentDAO.create(department);
	}

	public void updateDepartment(Department department) {
		departmentDAO.update(department);
	}

	public void deleteDepartment(short id) {
		departmentDAO.delete(id);
	}
}
