package com.app.service;

import org.springframework.stereotype.Service;

import com.app.repository.UserDao;

@Service
public class UserService
{
	UserDao userDao = new UserDao();
	
	

}
