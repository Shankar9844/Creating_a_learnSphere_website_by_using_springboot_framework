package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService 
{
	@Autowired
    UserRepository repo;
    
	@Override
	public String addUser(Users user)
	{
		   repo.save(user);
		   return "users added successfully";
	}

	@Override
	public boolean checkEmail(String email)
	{
		 return repo.existsByEmail(email);
	}

	@Override
	public boolean validate(String email, String password)
	{
	   if(repo.existsByEmail(email)==true)
	   {
		  Users u=repo.getByEmail(email);
		  String dbpassword=u.getPassword();
		  if(password.equals(dbpassword))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	   }
	   else
	   {
		   return false;
	   }
		
	}
	public boolean validates (String email)
	{
		if(repo.existsByEmail(email)==true)
	   {
			Users user = repo.getByEmail(email);
			String role = user.getRole();
			if(role.equals("trainer"))
			{
				return true;
			}
			else
			{
				return false;
			}
	}
		return false;
		
	}

	@Override
	public List<Users> takeCourse()
	{
	      return repo.findAll();
	}
	

}
