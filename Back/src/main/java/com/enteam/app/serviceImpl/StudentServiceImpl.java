package com.enteam.app.serviceImpl;

import com.enteam.app.repositories.StudentRepository;
import com.enteam.app.ressouces.Student;
import com.enteam.app.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getStudent(String login, String password) {
        //Optional<Student> student = this.studentRepository.findByLoginAndPassword(login, password);
        return null;
    }

    @Override
    public Student getStudent(Long id) {
        Optional<Student> student = this.studentRepository.findById(id);
        return student.orElse(null);
    }
}
