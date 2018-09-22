package com.CodeAlpha.demo.dao;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.CodeAlpha.demo.model.User;

@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public User register_user(User user) {
		// TODO Auto-generated method stub
		Session session = this.session.getCurrentSession();
		try {
			session.save(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
