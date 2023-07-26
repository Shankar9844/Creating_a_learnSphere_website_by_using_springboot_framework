package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Users;

public interface UserService 
{
     String addUser(Users user);
     boolean checkEmail(String email);
     boolean validate(String email, String password);
 	 public boolean validates (String email);
 	 public List<Users> takeCourse();
}
