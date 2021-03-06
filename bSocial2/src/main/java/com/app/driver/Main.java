package com.app.driver;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.User;
import com.app.repository.UserDao;

public class Main {
	static {System.out.println("Before");}
	public static ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	static {System.out.println("After");}
	public static UserDao udao = appContext.getBean("userRepo", UserDao.class);

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("APPLICATION START");
		//insertInitialValues();
		List<User> ua = udao.selectAllUsers();
		udao.selectAllUsers().stream().forEach(System.out::println);
		System.out.println("DONE");

	}

	private static void insertInitialValues() {
		// TODO Auto-generated method stub
		User ua = new User(10, "Captain", "Merica", "jkghbjasfd@bhjfsDbhdsf.com", "nudesPlz", "IMAGE HAHAHA LIKE WE'LL GET THAT");
		udao.insertUser(ua);
	}

}
