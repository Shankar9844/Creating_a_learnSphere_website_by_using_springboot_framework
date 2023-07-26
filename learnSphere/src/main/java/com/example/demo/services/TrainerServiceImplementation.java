package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.LessonRepository;


@Service
public class TrainerServiceImplementation implements TrainerService
{
	@Autowired
	CourseRepository cr;
	
    @Autowired
	LessonRepository lr;
    
	@Override
	public String addCourse(Course course)
	{
		cr.save(course);
		return "course added successfully";
	}
   @Override
	public String addLesson(Lesson lesson)
	{
		lr.save(lesson);
		return "lesson added successfully!";
		
	}
	@Override
	public Course getCourse(String courseName) 
	{
		 return cr.getBycourseName(courseName);
		
	}
	@Override
	public List<Course> showCourse() 
	{
		
		return cr.findAll();
	}
	@Override
	public Course getCourse(int courseID) 
	{
	       return cr.findById(null).get();
		
	}
}
