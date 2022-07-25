package com.vti.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.vti.entity.Position;
import com.vti.utils.HibernateUtils;

public class PositionDAO {

	private HibernateUtils hibernateUtils;

	public PositionDAO() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	// Hàm get list Position
	public List<Position> getListPosition() {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			String hqlSelectPosition = "FROM Position ORDER BY id";
			Query<Position> query = session.createQuery(hqlSelectPosition);
			return query.list();
		} finally {
			session.close();
		}
	}

	// Hàm findByID
	public Position getPositionByID(short id) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			return session.get(Position.class, id);
		} finally {
			session.close();
		}
	}

	// Hàm find Position by name
	public Position getPositionByName(String name) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			String hqlSelectPositionByName = "FROM Position WHERE name = :nameParam";
			Query<Position> query = session.createQuery(hqlSelectPositionByName);
			query.setParameter("nameParam", name);

			return query.uniqueResult();
		} finally {
			session.close();
		}
	}

	// Hàm create
	public void create(Position position) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();
			session.save(position);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}

	// Hàm upadate
	public void update(Position position) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();
			session.update(position);

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
			Position position = session.load(Position.class, id);

			session.delete(position);

			session.getTransaction().commit();
		} finally {
			session.close();
		}
	}

}
