package com.daoRepository;

import java.util.List;

//import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.models.User;

@Repository("UserDaoRepo")
@Transactional
@EnableTransactionManagement
public class UserDaoRepo {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Autowired
	private SessionFactory SF;
	
	public UserDaoRepo(){
		
	}
	
	public int insert (User user) {
		SF.getCurrentSession().save(user);
		return 1;
	}
	
	public int updateUser (User user) {
		SF.getCurrentSession().createQuery("update Users set displayName= " + user.getDisplayImg() + " where " + user.getUsername()+" ");
		return 1;
	}
	
	public User selectUser (String username) {
		return SF.getCurrentSession().get(User.class, username);
		
	}
	
	public User selectUser (String username, String password) {
		List<User> users = SF.getCurrentSession().createQuery("from Users where username= " + username + ", where password= " + password).list();
		User LoginUser = users.get(0);
		return LoginUser;
	}
	
//	public int selectAllUsers () {
//		List<User> users = SF.getCurrentSession().createQuery("from Users", User.class).list();
//		return 1;
//	}

}
