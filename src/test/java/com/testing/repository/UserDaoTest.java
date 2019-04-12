package com.testing.repository;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.User;
import com.app.repository.UserDao;

public class UserDaoTest
{
	public static ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	public static UserDao userDao = appContext.getBean("userRepo", UserDao.class);
	
	@Before
	public void before()
	{
		System.out.println("BEGIN NEW TEST");
	}

	@After
	public void after()
	{
		System.out.println("TEST RUN COMPLETE");
	}
	
	@Test
	public void insertUser()
	{
		User testUser = new User(0, "username", "password", "testUser@mail.com", "Display Name", "Image URL");
		userDao.insert(testUser);	
	}
	
	@Test
	public void updateUser()
	{
		User testUser = userDao.selectById(0);
		System.out.println(testUser);
	}
	
	@Test
	public void selectUser()
	{
		User testUser = userDao.selectById(0);
		System.out.println(testUser);
	}
	
	@Test
	public void selectAllUsers()
	{
		List<User> userList = userDao.selectAll();
		System.out.println(userList);
	}
	
	@Test
	public void deleteUser()
	{
		User testUser = new User(0, "username", "password", "testUser@mail.com", "Display Name", "Image URL");
		userDao.deleteUser(testUser);
	}
}
