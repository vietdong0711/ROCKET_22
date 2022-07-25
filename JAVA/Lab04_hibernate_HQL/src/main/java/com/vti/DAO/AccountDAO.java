package com.vti.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.vti.entity.Account;
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
			Query<Account> query = session.createQuery("FROM Account ORDER BY id");
			List<Account> ls = query.list();
			return ls;

		} finally {
			session.close();
		}
	}

	public Account getAccountByID(short id) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Query<Account> query = session.createQuery("FROM Account WHERE id =:id");
			query.setParameter("id", id);
			return query.uniqueResult();
		} finally {
			session.close();
		}
	}

	public String getFullNameByID(short id) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Query<String> query = session.createQuery("SELECT fullName FROM Account WHERE id =:id");
			query.setParameter("id", id);
			return query.uniqueResult();
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
