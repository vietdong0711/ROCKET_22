package com.vti.DAO;

import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Account> query = builder.createQuery(Account.class);
			Root<Account> root = query.from(Account.class);// from account

			query.select(root);// Select
			return session.createQuery(query).list();
		} finally {
			session.close();
		}
	}

	public Account getAccountByID(short id) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Account> query = builder.createQuery(Account.class);
			Root<Account> root = query.from(Account.class);// from account

			// select *
			query.select(root);
			query.where(builder.equal(root.get("id"), id));// điều kiện where
			return session.createQuery(query).uniqueResult();
		} finally {
			session.close();
		}
	}

	public String getFullNameByID(short id) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<String> query = builder.createQuery(String.class);
			Root<Account> root = query.from(Account.class);// from account

			// select *
			query.multiselect(root.get("fullName"));// lấy ra 1 thuộc tính
			query.where(builder.equal(root.get("id"), id));// điều kiện where
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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Account> query = builder.createQuery(Account.class);
			Root<Account> root = query.from(Account.class);// from account

			query.select(root);
			String[] strings = root.get("createDate").toString().split("-");
			String stringRoot = strings[0] + strings[1];
			Date date = new Date();
			String[] strings1 = date.toString().split("-");
			String stringss = strings1[0] + strings1[1];
			query.where(builder.equal(stringRoot,stringss);
			session = hibernateUtils.openSession();
//			Query<Account> query = session.createQuery(
//					"FROM Account WHERE month(createDate) = month(sysdate()) and year(createDate) = year(sysdate()) ORDER BY createDate DESC");
			return null;
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
