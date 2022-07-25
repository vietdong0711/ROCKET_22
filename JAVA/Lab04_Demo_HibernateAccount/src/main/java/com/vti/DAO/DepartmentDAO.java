package com.vti.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.vti.entity.Department;
import com.vti.utils.HibernateUtils;

public class DepartmentDAO {
	private HibernateUtils hibernateUtils;

	public DepartmentDAO() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	// Hàm get list department
	public List<Department> getListDepartment() {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			String hqlSelectDepartment = "FROM Department ORDER BY id";
			Query<Department> query = session.createQuery(hqlSelectDepartment);
			return query.list();
		} finally {
			session.close();
		}
	}

	// Hàm findByID
	public Department getDepartmentByID(short id) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			return session.get(Department.class, id);
		} finally {
			session.close();
		}
	}

	// Hàm find department by name
	public Department getDepartmentByName(String name) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			String hqlSelectDepartmentByName = "FROM Department WHERE name = :nameParam";
			Query<Department> query = session.createQuery(hqlSelectDepartmentByName);
			query.setParameter("nameParam", name);

			return query.uniqueResult();
		} finally {
			session.close();
		}
	}

	// Hàm create
	public void create(Department department) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();
			session.save(department);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}

	// Hàm upadate
	public void update(Department department) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();
			session.update(department);

			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}

	// Hàm delete
	public void delete(short id) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();
			Department department = session.load(Department.class, id);

			session.delete(department);

			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}

}
