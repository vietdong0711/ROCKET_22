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
			String hqlSelectPosition = "FROM Account ORDER BY id";
			Query<Account> query = session.createQuery(hqlSelectPosition);
			return query.list();
		} finally {
			session.close();
		}
	}

	public Account getAccountByID(short id) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			return session.get(Account.class, id);
		} finally {
			session.close();
		}
	}

}
