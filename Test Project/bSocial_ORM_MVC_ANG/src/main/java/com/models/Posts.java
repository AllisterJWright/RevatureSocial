package com.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Posts")
public class Posts {
	
	//fields
	@Id
	@Column(name= "Post_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Post_Id;
	
	@Column(name= "Title Column")
	private String Title;
	
	@Column(name= "Image")
	private Object image;
	
	@Column(name= "Caption")
	private String caption;
	
	@ManyToOne(fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	@JoinColumn(name= "username", nullable = false)
	private String username;
	
	@OneToMany(fetch= FetchType.EAGER, cascade= CascadeType.ALL)
	@JoinColumn(name= "Comment_ID")
	private List<Comments> comments;
	
	@OneToMany(fetch= FetchType.EAGER, cascade= CascadeType.ALL)
	@JoinColumn(name= "Ratings_ID")
	private List<Ratings> ratings;	

	
	
	//getters and setters
	
	public int getPost_Id() {
		return Post_Id;
	}
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public Object getImage() {
		return image;
	}
	public void setImage(Object image) {
		this.image = image;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getUsername() {
		return username;
	}
	


	//constructors
	public Posts() {
		super();
	}

	public Posts(int post_Id, String title, Object image, String caption, String username) {
		super();
		Post_Id = post_Id;
		Title = title;
		this.image = image;
		this.caption = caption;
		this.username = username;
	}
	
}
