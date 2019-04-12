package com.app.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.app.model.User;

@Repository("userRepo")
@Transactional
public class UserDao {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Autowired
	private SessionFactory sesFact;
	
	public UserDao() {
	}
	
	public void insertUser(User user) {
		sesFact.getCurrentSession().save(user);
	}
	
	public void updateUser(User user) {
		sesFact.getCurrentSession().update(user);
	}
	
	public User selectUserById(int id) {
		return sesFact.getCurrentSession().get(User.class, id);
	}
	
	public List<User> selectAllUsers() {
		List<User> userList = sesFact.getCurrentSession().createQuery("from User", User.class).list();
		return userList;
	}
	
	public void deleteUser(User user) {
		sesFact.getCurrentSession().remove(user);
	}
}
