package com.vti.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;
import com.vti.entity.PositionName;
import com.vti.utils.HibernateUtils;

public class AccountDAO {

	private HibernateUtils hibernateUtils;

	public AccountDAO() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	// Hàm get list Position
	public List<Account> getListAccount() {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
//			String hqlSelectPosition = "FROM Account ORDER BY id";
//			Query<Account> query = session.createQuery(hqlSelectPosition);
			// criteria
//			CriteriaBuilder builder = session.getCriteriaBuilder();
//			CriteriaQuery<Account> query = builder.createQuery(Account.class);
//			Root<Account> root = query.from(Account.class);// from account
//
//			query.select(root);// Select
//			return session.createQuery(query).list();
			// Navite SQL
			String sqlNative = "SELECT a.AccountID, a.Email, a.Username, a.FullName, a.DepartmentID, d.DepartmentName, a.PositionID, p.PositionName, a.CreateDate FROM account a\r\n"
					+ "INNER JOIN department d  ON a.DepartmentID = d.DepartmentID\r\n"
					+ "INNER JOIN position p  ON a.PositionID = p.PositionID;\r\n";
			NativeQuery query = session.createNativeQuery(sqlNative);
			List<Object[]> ls = query.getResultList();
			List<Account> accounts = new ArrayList<Account>();
			for (Object[] objects : ls) {
				Account account = new Account();
				account.setId(Short.parseShort(objects[0].toString()));
				account.setEmail(objects[1].toString());
				account.setUserName(objects[2].toString());
				account.setFullName(objects[3].toString());
				Department department = new Department();
				department.setId(Short.parseShort(objects[4].toString()));
				department.setName(objects[5].toString());
				account.setDepartment(department);
				Position position = new Position();
				position.setId(Short.parseShort(objects[6].toString()));
				position.setName(PositionName.valueOf(objects[7].toString()));
				account.setPosition(position);
				accounts.add(account);
			}

			return accounts;
		} finally {
			session.close();
		}
	}

	public Account getAccountByID(short id) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
//			Query<String> query = session.createQuery("SELECT fullName FROM Account WHERE id =:id");
//			query.setParameter("id", id);
			// ***Criteria
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Account> query = builder.createQuery(Account.class);
			Root<Account> root = query.from(Account.class);// from account

			// select *
			query.select(root);
			query.where(builder.equal(root.get("id"), id));
			return session.createQuery(query).uniqueResult();
		} finally {
			session.close();
		}
	}

	public String getFullNameByID(short id) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
//			Query<String> query = session.createQuery("SELECT fullName FROM Account WHERE id =:id");
//			query.setParameter("id", id);
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<String> query = builder.createQuery(String.class);
			Root<Account> root = query.from(Account.class);// from account

			// select *
			query.multiselect(root.get("fullName"));
			query.where(builder.equal(root.get("id"), id));
			return session.createQuery(query).uniqueResult();
		} finally {
			session.close();
		}
	}

	// Lấy ra các account đc tạo trong tháng hiện tại
	public List<Account> getAccountCurrMonth() {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Query<Account> query = session.createQuery(
					"FROM Account WHERE month(createDate) = month(sysdate()) and year(createDate) = year(sysdate()) ORDER BY createDate DESC");
			return query.list();
		} finally {
			session.close();
		}
	}

	// Lấy ra ds số thành viên đc thêm từng tháng trong năm
//	SELECT month(a.CreateDate) As `Month`, count(a.CreateDate) AS SL FROM `account` a
//	WHERE year(a.CreateDate) = year(now()) 
//	GROUP BY month(a.CreateDate);
	public List<Object[]> getListCountAccountCurrMonth() {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Query<Object[]> query = session.createQuery(
					"SELECT month(a.createDate) As Month, COUNT(a.createDate) AS SL FROM Account a WHERE year(a.createDate) = year(sysdate()) GROUP BY month(createDate)");

			return query.list();
		} finally {
			session.close();
		}
	}

	// Lấy ra ds số thành viên dc tạo và >=3 người
	public List<Object[]> getListCountAccountCurrMonthHaving3() {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Query<Object[]> query = session.createQuery(
					"SELECT month(a.createDate) As Month, COUNT(a.createDate) AS SL FROM Account a WHERE year(a.createDate) = year(sysdate()) GROUP BY month(createDate) HAVING COUNT(a.createDate)>=3	");

			return query.list();
		} finally {
			session.close();
		}
	}

	// delete theo email
	public void deleteByEmail(String email) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();
			Query query = session.createQuery("DELETE FROM Account WHERE email =:email");
			query.setParameter("email", email);
			query.executeUpdate();
			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}

}
