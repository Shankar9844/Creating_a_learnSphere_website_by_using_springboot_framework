package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Lesson;
import com.example.demo.services.StudentService;

@Controller
public class StudentControler 
{
	@Autowired
	StudentService ss;
	
	@PostMapping("/ssss")
     public String myLesson(@RequestParam ("lessonID") int lessonID, Model model)
     {
		 Lesson lesson =ss.myLesson(lessonID);
		 model.addAttribute("lesson", lesson);
		 System.out.println(lesson);
		 return "myLessons";
     }
}
