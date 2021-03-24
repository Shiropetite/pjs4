package com.enteam.app.services;

import com.enteam.app.ressouces.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    public Student getStudent(String login, String password);
    public Student getStudent(Long id);
}
