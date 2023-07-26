package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;

public interface TrainerService
{
    public String addCourse(Course course);
    public Course getCourse(int courseID);
    public Course getCourse(String courseName);
    public String addLesson(Lesson lesson);
    public List<Course> showCourse();
}
