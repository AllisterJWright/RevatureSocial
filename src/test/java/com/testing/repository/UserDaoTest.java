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
<<<<<<< HEAD
		User testUser = new User(0, "username", "password", "testUser@mail.com", "Display Name", "Image URL");
		userDao.insertUser(testUser);	
=======
		User testUser = new User(5, "gfdbcv", "pass", "jkfdmbnsfdjn@hvjfjbhfdhbj.com", "Cyka", "jfgjgf");
		userDao.insert(testUser);	
>>>>>>> dc6994eae62f1e2557fe784d17f42b563314e208
	}
	
	@Test
	public void updateUser()
	{
<<<<<<< HEAD
		User testUser = userDao.selectUserById(0);
=======
		User testUser = userDao.selectById(0);
>>>>>>> dc6994eae62f1e2557fe784d17f42b563314e208
		System.out.println(testUser);
	}
	
	@Test
	public void selectUser()
	{
<<<<<<< HEAD
		User testUser = userDao.selectUserById(0);
=======
		User testUser = userDao.selectById(0);
>>>>>>> dc6994eae62f1e2557fe784d17f42b563314e208
		System.out.println(testUser);
	}
	
	@Test
	public void selectAllUsers()
	{
<<<<<<< HEAD
		List<User> userList = userDao.selectAllUsers();
=======
		List<User> userList = userDao.selectAll();
>>>>>>> dc6994eae62f1e2557fe784d17f42b563314e208
		System.out.println(userList);
	}
	
	@Test
	public void deleteUser()
	{
<<<<<<< HEAD
		User testUser = new User(0, "username", "password", "testUser@mail.com", "Display Name", "Image URL");
=======
		User testUser = new User(5, "killmeplz", "paspassdxgzbfgwordsword", "testUsreer@fzgfdmail.com", "Dispxzgfzsgffdsdlay Name", "Imagesdf URzgfcxL");
>>>>>>> dc6994eae62f1e2557fe784d17f42b563314e208
		userDao.deleteUser(testUser);
	}
}
