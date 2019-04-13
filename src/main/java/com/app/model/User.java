package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Users")
public class User
{
	@Id
	@Column (name = "user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@Column (name = "username", unique = true, nullable = false)
	private String username;
	
	@Column (name = "password", nullable = false)
	private String password;
	
	@Column (name = "email", unique = true, nullable = false)
	private String email;
	
	@Column (name = "display_name", nullable = false)
	private String displayName;
	
	@Column (name = "display_image_url", nullable = false)
	private String displayImg; 		// link to s3 for profile picture
	
	public User() {}

	public User(int userId, String username, String password, String email, String displayName, String displayImg)
	{
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.displayName = displayName;
		this.displayImg = displayImg;
	}
	
<<<<<<< HEAD
	public User(String username, String password, String email, String displayName, String displayImg)
	{
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.displayName = displayName;
		this.displayImg = displayImg;
	}
	
=======
>>>>>>> dc6994eae62f1e2557fe784d17f42b563314e208
	public User(String username, String password, String email)
	{
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public User(int userId, String displayName, String displayImg)
	{
		super();
		this.userId = userId;
		this.displayName = displayName;
		this.displayImg = displayImg;
	}

	public int getUserId()
	{
		return userId;
	}

	public void setUserId(int userId)
	{
		this.userId = userId;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getDisplayName()
	{
		return displayName;
	}

	public void setDisplayName(String displayName)
	{
		this.displayName = displayName;
	}

	public String getDisplayImg()
	{
		return displayImg;
	}

	public void setDisplayImg(String displayImg)
	{
		this.displayImg = displayImg;
	}

	@Override
	public String toString()
	{
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", displayName=" + displayName + ", displayImg=" + displayImg + "]";
	}
}
