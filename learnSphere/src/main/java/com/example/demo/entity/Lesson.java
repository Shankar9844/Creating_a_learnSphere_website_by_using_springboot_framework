package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lesson 
{
	@Id
	int lessonID;
	String lessonName;
	String lessonTopics;
	String lessonLinks;
	@ManyToOne
	Course course;
	public Lesson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lesson(int lessonID, String lessonName, String lessonTopics, String lessonLinks, Course course) {
		super();
		this.lessonID = lessonID;
		this.lessonName = lessonName;
		this.lessonTopics = lessonTopics;
		this.lessonLinks = lessonLinks;
		this.course = course;
	}
	public int getLessonID() {
		return lessonID;
	}
	public void setLessonID(int lessonID) {
		this.lessonID = lessonID;
	}
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public String getLessonTopics() {
		return lessonTopics;
	}
	public void setLessonTopics(String lessonTopics) {
		this.lessonTopics = lessonTopics;
	}
	public String getLessonLinks() {
		return lessonLinks;
	}
	public void setLessonLinks(String lessonLinks) {
		this.lessonLinks = lessonLinks;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Lesson [lessonID=" + lessonID + ", lessonName=" + lessonName + ", lessonTopics=" + lessonTopics
				+ ", lessonLinks=" + lessonLinks + ", course=" + course + "]";
	}
    
      
      
}
