package com.daoRepository;

//import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;

import com.models.User;

@Repository
//@Transactional
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
		SF.getCurrentSession().createQuery("update Users where username= " + user.getUsername());
		return 1;
	}
	
	public User selectUser (User user) {
		user = SF.getCurrentSession().get(User.class, user.getUsername());
		return user;
	}
	
//	public int selectAllUsers () {
//		List<User> users = SF.getCurrentSession().createQuery("from Users", User.class).list();
//		return 1;
//	}

}
