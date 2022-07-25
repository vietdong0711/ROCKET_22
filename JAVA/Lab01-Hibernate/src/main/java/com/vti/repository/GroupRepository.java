package com.vti.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.vti.entity.Group;
import com.vti.utils.HibernateUtils;

public class GroupRepository {

	private HibernateUtils hibernateUtils;

	public GroupRepository() {
		hibernateUtils = hibernateUtils.getInstance();
	}

	public List<Group> getAllGroups() {
		Session session = null;
		List<Group> ls;
		try {
			session = hibernateUtils.openSession();
			Query<Group> query = session.createQuery("FROM Group");
			ls = query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return ls;
	}

	public Group getGroupByID(int id) {
		Session session = null;
		Group gr;
		try {
			session = hibernateUtils.openSession();
			gr = session.get(Group.class, id);
			return gr;
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	public Group getGroupByName(String name) {
		Session session = null;
		Group gr;
		try {
			session = hibernateUtils.openSession();
			Query<Group> query = session.createQuery("FROM Group WHERE name :=nameParameter");
			query.setParameter("nameParameter", name);
			gr = query.uniqueResult();
			return gr;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void updateGroup(int id) {
		Session session = null;
		Group gr = getGroupByID(id);
		try {
			session = hibernateUtils.openSession();
			Query<Group> query = session.createQuery("FROM Group WHERE name :=nameParameter");
//			query.setParameter("nameParameter", nameParameter);
			gr = query.uniqueResult();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
