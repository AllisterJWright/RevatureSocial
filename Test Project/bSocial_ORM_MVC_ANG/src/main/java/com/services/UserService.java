package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoRepository.UserDaoRepo;
import com.models.User;

@Service
public class UserService {

	@Autowired
	UserDaoRepo UDR;
	
	public User findPerson (User user) {
		User FoundUser = UDR.selectUser(user);
		return FoundUser;
	}
	
	public int register (User user) {
		UDR.insert(user);
		return 0;
	}
	
	public User update (User user) {
		UDR.updateUser(user);
		User updatedUser = UDR.selectUser(user);
		return updatedUser;
	}
	
	
}
