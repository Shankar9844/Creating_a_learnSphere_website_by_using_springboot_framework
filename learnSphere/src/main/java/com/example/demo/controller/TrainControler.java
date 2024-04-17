//this is the comment
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;
import com.example.demo.services.TrainerService;

import jakarta.servlet.http.HttpSession;

@Controller
public class TrainControler 
{
	@Autowired
	TrainerService tr;
	
	@PostMapping("/addCourse")
    public String addCourse(@RequestParam("courseID") int courseID,
    		                                           @RequestParam("courseName")String courseName,
    		                                           @RequestParam("coursePrice")int coursePrice)
            
    {
		        Course course=new Course();
				course.setCourseID(courseID);
		         course.setCourseName(courseName);
		         course.setCoursePrice(coursePrice);
    	        tr.addCourse(course);
         
    	        return  "Course";
    }
	@PostMapping("/addLesson")
    public String lesson(@RequestParam("courseID") int courseID,
    		                                           @RequestParam("lessonID")int lesssonID,
    		                                           @RequestParam("lessonName")String lessonName,
    		                                           @RequestParam("lessonTopics")String lessonTopics,
    		                                           @RequestParam("lessonLinks")String lessonLinks)
            
    {
	   Course course=tr.getCourse(courseID);
	   Lesson lesson=new Lesson(lesssonID,lessonName,lessonTopics,lessonLinks,course);
	   tr.addLesson(lesson);
	   course.getLessons().add(lesson);
	   return  "index";
    }
    
	@PostMapping("/llll")
	public String showCourse(@RequestParam("courseName") String courseName, Model model)
	{
       Course courseList = tr.getCourse(courseName);
       model.addAttribute("courseList", courseList);
	   System.out.println(courseList);
	   return "Chooses";
	}
	

	
}
