package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comments
{   @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
       int id;
       String comment;
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comments(int id, String comment) {
		super();
		this.id = id;
		this.comment = comment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Comments [id=" + id + ", comment=" + comment + "]";
	}
       
}
