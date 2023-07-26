package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Comments;

public interface CommentService 
{
     public String addComment(Comments comment);
     public List<Comments> takeComment();
}
