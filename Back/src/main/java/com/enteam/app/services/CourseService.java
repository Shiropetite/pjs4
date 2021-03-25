package com.enteam.app.services;

import com.enteam.app.ressouces.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses(Long id_student);

}
