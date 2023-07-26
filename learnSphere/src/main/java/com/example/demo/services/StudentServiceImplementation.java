package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Lesson;
import com.example.demo.repository.LessonRepository;
@Service
public class StudentServiceImplementation implements StudentService
{
   @Autowired
	LessonRepository lrs;
   
	@Override
	public Lesson myLesson(int lessonID) 
	{
		 return lrs.getById(lessonID);
		
	}

}
