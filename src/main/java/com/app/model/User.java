package com.app.model;

import org.springframework.stereotype.Component;

@Component
public class User
{
	private int userId;
	private String username;
	private String password;
	private String email;
	private String displayName;
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
