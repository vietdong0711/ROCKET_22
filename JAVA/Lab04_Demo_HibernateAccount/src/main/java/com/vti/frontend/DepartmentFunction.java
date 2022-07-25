package com.vti.frontend;

import java.util.List;
import java.util.Scanner;

import com.vti.DAO.DepartmentDAO;
import com.vti.entity.Department;

public class DepartmentFunction {
	private DepartmentDAO departmentDAO;

	public DepartmentFunction() {
		departmentDAO = new DepartmentDAO();
	}

	public void showDepartments() {
		List<Department> listDepartment = departmentDAO.getListDepartment();

		String leftAlignFormat = "| %-6d | %-21s |%n";
		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   ID   | Department  Name      |%n");
		System.out.format("+--------+-----------------------+%n");
		for (Department department : listDepartment) {
			System.out.format(leftAlignFormat, department.getId(), department.getName());

		}
		System.out.format("+--------+-----------------------+%n");

	}

	public void createDepartment() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập department name:");
		String name = sc.nextLine();
		Department department = new Department();
		short a = 11;
		department.setId(a);
		department.setName(name);
		try {
			departmentDAO.create(department);
			System.out.println("Thêm thành công");
		} catch (Exception e) {
			System.out.println("Error:" + e.getCause().getLocalizedMessage());
		}
	}

	public void updateDepartment() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID cần update:");
		short id = sc.nextShort();
		sc.nextLine();
		Department department = departmentDAO.getDepartmentByID(id);
		if (department == null) {
			System.out.println("Không có ai có ID = " + id);
		} else {
			System.out.print("Nhập DepartmentName:");
			String name = sc.nextLine();
			department.setName(name);
			try {
				departmentDAO.update(department);
				System.out.println("Update thành công");
			} catch (Exception e) {
				System.out.println("Error:" + e.getCause().getLocalizedMessage());
			}
		}
	}

	public void deleteDepartment() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID cần xóa:");
		short id = sc.nextShort();
		sc.nextLine();
		Department department = departmentDAO.getDepartmentByID(id);
		if (department == null) {
			System.out.println("Không có department có id = " + id);
		} else {
			try {
				departmentDAO.delete(id);
				System.out.println("Xóa thành công");
			} catch (Exception e) {
				System.out.println("Error:" + e.getCause().getLocalizedMessage());
				e.printStackTrace();
			}
		}

	}
}
