package com.CodeAlpha.demo.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.CodeAlpha.demo.dao.UserDao;
import com.CodeAlpha.demo.model.User;

public class UserServicesImpl implements UserServices {

	
	@Autowired
	private UserDao userDao;
	
	
	@Override
	public User register_user(User user) {
		// TODO Auto-generated method stub
		User user2 = new User();
		user2.setUser_id(UUID.randomUUID().toString());
		user2.setUser_fullname(user.getUser_fullname());
		user2.setUser_email(user.getUser_email());
		user2.setUser_name(user.getUser_name());
		user2.setUser_password(user.getUser_password());
		
		 return this.userDao.register_user(user2);
	}

}
