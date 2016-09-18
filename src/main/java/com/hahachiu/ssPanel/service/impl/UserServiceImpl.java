package com.hahachiu.ssPanel.service.impl;

import java.util.List;

import com.hahachiu.ssPanel.entity.User;
import com.hahachiu.ssPanel.service.*;

public class UserServiceImpl extends ServiceSupport<User> implements
		UserService {

	public void saveUser(User user) {
		this.getDao().save(user);	
	}

	public User verifyUser(String email, String password) {
		List<User> users = this.getDao().findBy("email", email);
		for(User user: users){
			if (user.getPassword().equals(password)){
				return user;
			}
		}
		return null;
	}

}
