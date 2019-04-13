package com.app.driver;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.User;
import com.app.repository.UserDao;

public class Main {
	static {System.out.println("Before");}
	public static ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	static {System.out.println("After");}
	public static UserDao udao = appContext.getBean("userRepo", UserDao.class);

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("KILL ME");
		insertInitialValues();
		List<User> ua = udao.selectAll();
		udao.selectAll().stream().forEach(System.out::println);

	}

	private static void insertInitialValues() {
		// TODO Auto-generated method stub
		User ua = new User(10, "Captain", "Merica", "jkghbjasfd@bhjfsDbhdsf.com", "nudesPlz", "IMAGE HAHAHA LIKE WE'LL GET THAT");
		udao.insert(ua);
	}

}
