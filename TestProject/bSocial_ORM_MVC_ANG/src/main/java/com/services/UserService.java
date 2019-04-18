package com.services;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.daoRepository.UserDaoRepo;
import com.models.User;

@Service
public class UserService {

	@Autowired
	UserDaoRepo UDR;

	public User findPerson (String username) {
		User FoundUser = UDR.selectUser(username);
		return FoundUser;
	}
	
	public int register (User user) {
		UDR.insert(user);
		return 0;
	}
	
	public User Login (String username, String password) {
		User LoginUser = UDR.selectUser(username, password);
		return LoginUser;
	}
	
	public User update (User user) {
		UDR.updateUser(user);
		String username = user.getUsername();
		User updatedUser = UDR.selectUser(username);
		return updatedUser;
	}
	
	
}
