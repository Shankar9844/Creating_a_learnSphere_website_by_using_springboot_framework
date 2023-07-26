package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.w3c.dom.Comment;
import com.example.demo.entity.Comments;
import com.example.demo.entity.Users;
import com.example.demo.services.CommentService;
import com.example.demo.services.UserService;

@Controller
public class ServiceController
{
	@Autowired
	UserService uService;
	
	@Autowired
	CommentService cs;
	
	@PostMapping("/addUser")
	public String addStudent(@RequestParam("name" )String name,
			                                           @RequestParam("email")String email,
			                                           @RequestParam("password")String password,
			                                           @RequestParam("role")String role )
	{
		
		boolean emailExist=uService.checkEmail(email);
		if(emailExist==false)
		{
			Users user=new Users();
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			user.setRole(role);
			uService.addUser(user);
		    System.out.println("user registerd successfully");
		    return "redirect:/login";
		}
		else
		{
			System.out.println("user already registerd");
			return "redirect:/login";
		}
		
	}
	@PostMapping("/validate")
	public String validate(@RequestParam("email")String email,
                                 @RequestParam("password")String password)
	{
		
		boolean val=uService.validate(email, password);
		boolean cal=uService.validates(email);
		if(val==true)
		{
			if(cal==true)
			{
				return "TrainerHome";
			}
			else
			{
				return "studentHome";
			}
			
			
		}
		else
		{
			System.out.println("incorrect username or password, try again");
			return "login";
		}
		
	
	}
	
	@PostMapping("/addC")
	public String addComment(@RequestParam("comment") String comment, Model model)
	{
		Comments c=new Comments();
		c.setComment(comment);
		cs.addComment(c);
		List<Comments>commentss=cs.takeComment();
		model.addAttribute(comment, commentss);
		return "index";
	}
	
	
}

