package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Comments;
import com.example.demo.repository.CommentRepository;

@Service
public class CommentServiceImplementation implements CommentService
{
	@Autowired
    CommentRepository cmr;
	
	@Override
	public String  addComment(Comments comment) 
	{
	    cmr.save(comment);
		return "the comment added successfully";
	}
	@Override
	public List<Comments> takeComment() {
	     return cmr.findAll();
		
	}

}
