package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

public class Vote
{
	@Id
	@Column(name= "ratings_ID")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int ratingsID;
	
	@Column(name= "value")
	private String value;
	
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name= "Post_ID")
	Post post;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "username")
	User user;
	
	//Getters and Setters
	
	
	public void setPost(Post post) {
		this.post = post;
	}
	public int getRatingsID() {
		return ratingsID;
	}
	public String getValue() {
		return value;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	//Constructors
	public Vote() {
		super();
	}
	
	public Vote(Post post, User user) {
		super();
		this.post = post;
		this.user = user;
	}
	
	public Vote(int ratingsID, String value, Post post, User user) {
		super();
		this.ratingsID = ratingsID;
		this.value = value;
		this.post = post;
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "Ratings [ratingsID=" + ratingsID + ", value=" + value + ", post=" + post + ", user=" + user + "]";
	}
}
