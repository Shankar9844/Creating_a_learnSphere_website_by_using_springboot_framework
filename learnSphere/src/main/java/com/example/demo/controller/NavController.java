//this is the first comment
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController 
{
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/Home")
	public String Home()
	{
		return "Home";
	}
	
	@GetMapping("/Course")
	public String Course()
	{
		return "Course";
	}
	
	@GetMapping("/addLesson")
	public String addLesson()
	{
		return "addLesson";
	}
	
	@GetMapping("/studentHome")
	public String studentHome()
	{
		return "studentHome";
	}
	
	@GetMapping("/TrainerHome")
	public String TrainerHome()
	{
		return "TrainerHome";
	}
	
	@GetMapping("/viewCourse")
	public String viewCourse()
	{
		return "viewCourse";
	}
	
	@GetMapping("/demoLesson")
	public String demoLesson()
	{
		return "demoLesson";
	}
	
	@GetMapping("/myLessons")
	public String myLessons()
	{
		return "myLessons";
	}
	
	@GetMapping("/ChooseCourse")
	public String ChooseCourse()
	{
		return "ChooseCourse";
	}
	
	@GetMapping("/Chooses")
	public String Chooses()
	{
		return "Chooses";
	}
}
