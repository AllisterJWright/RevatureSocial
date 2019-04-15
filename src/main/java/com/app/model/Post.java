package com.app.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "UsersPosts")
public class Post
{
	@Id
	@Column (name = "post_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int postId;
	
	@Column (name = "author_name")
	String username;
	
	@Column (name = "created_at", nullable=false)
	@CreationTimestamp
	Instant timestampOrig;
	
	@Column (name = "last_edited")
	@UpdateTimestamp
	Instant timestampEdit;
	
	@Column (name = "content", nullable = false)
	String content;

	public Post()
	{
		super();
	}

	public Post(int postId, String username, Instant timestampOrig, Instant timestampEdit, String content)
	{
		super();
		this.postId = postId;
		this.username = username;
		this.timestampOrig = timestampOrig;
		this.timestampEdit = timestampEdit;
		this.content = content;
	}

	public Post(String username, String content)
	{
		super();
		this.username = username;
		this.content = content;
	}

	public int getPostId()
	{
		return postId;
	}

	public void setPostId(int postId)
	{
		this.postId = postId;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public Instant getTimestampOrig()
	{
		return timestampOrig;
	}

	public Instant getTimestampEdit()
	{
		return timestampEdit;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	@Override
	public String toString()
	{
		return "UserPost [postId=" + postId + ", username=" + username + ", timestampOrig=" + timestampOrig
				+ ", timestampEdit=" + timestampEdit + ", content=" + content + "]";
	}
		
}
