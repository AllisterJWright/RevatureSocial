package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Comments")
public class Comment{
	
	@Id
	@Column(name= "comment_id")
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int CommentId;
	
	@Column(name= "post_id")
	private int postID;
	
	@Column(name= "username")
	private String username;
	
	@Column(name= "message")
	private String comment;

	public Comment() {
		super();
	}	

	public Comment(int postID, String user, String comment) {
		super();
		this.postID = postID;
		this.username = user;
		this.comment = comment;
	}

	public Comment(int commentId, int postID, String user, String comment) {
		super();
		CommentId = commentId;
		this.postID = postID;
		this.username = user;
		this.comment = comment;
	}

	public int getCommentId() {
		return CommentId;
	}

	public String getUser() {
		return username;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Comments [CommentId=" + CommentId + ", postID=" + postID + ", username=" + username + ", comment="
				+ comment + "]";
	}	
}
