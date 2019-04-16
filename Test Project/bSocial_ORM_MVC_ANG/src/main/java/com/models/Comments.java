package com.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Comments")
public class Comments {
	
	@Id
	@Column(name= "Comment_ID")
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int CommentId;
	
	@ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name= "Post_ID")
	private Posts post;
	
	@ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name= "username")
	private User user;
	
	@Column(name= "Comment")
	private String comment;
	
	
	//Getters
	public Posts getPost() {
		return post;
	}

	public int getCommentId() {
		return CommentId;
	}

	public User getUser() {
		return user;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	//constructors
	public Comments() {
		super();
	}	
	
	

	public Comments(Posts post, User user, String comment) {
		super();
		this.post = post;
		this.user = user;
		this.comment = comment;
	}

	public Comments(int commentId, Posts post, User user, String comment) {
		super();
		CommentId = commentId;
		this.post = post;
		this.user = user;
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Comments [CommentId=" + CommentId + ", post=" + post + ", user=" + user + ", comment=" + comment + "]";
	}

	
}
