package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repository.UserDao;

@Service
public class UserService
{
	UserDao userDao = new UserDao();
	
	public void insertUser(User user)
	{
		userDao.insertUser(user);
	}
	
	public void updateUser(User user)
	{
		userDao.updateUser(user);
	}
	
	public User selectUserById(int id)
	{
		return userDao.selectUserById(id);
	}
	
	public List<User> selectAllUsers()
	{
		return userDao.selectAllUsers();
	}
	
	public void deleteUser(User user)
	{
		userDao.deleteUser(user);
	}

}
