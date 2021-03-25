package com.enteam.app.serviceImpl;

import com.enteam.app.repositories.CourseRepository;
import com.enteam.app.repositories.GroupStudentRepository;
import com.enteam.app.repositories.StudentRepository;
import com.enteam.app.ressouces.Course;
import com.enteam.app.ressouces.GroupStudent;
import com.enteam.app.ressouces.Student;
import com.enteam.app.services.CourseService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class CourseServiceImpl implements CourseService {
   private StudentRepository studentRepository;
   private GroupStudentRepository groupsRepository;

    public CourseServiceImpl(StudentRepository studentRepository, GroupStudentRepository groupsRepository) {
        this.studentRepository = studentRepository;
        this.groupsRepository = groupsRepository;
    }

    // Cours du jour
    public List<Course> getCourses(Long id_student) {
        Optional<Student> student = this.studentRepository.findById(id_student);
        if(student.isPresent()) {
            Long id_group = student.get().getStudentGroup().getId();
            Optional<GroupStudent> group = this.groupsRepository.findById(id_group);
            if(group.isPresent()) {
                List<Course> list = new ArrayList<>();
                Date today = new Date();
                for(Course c : group.get().getCourses()) {
                    if(c.getDate().getYear() == today.getYear() && c.getDate().getMonth() == today.getMonth()
                            && c.getDate().getDay() == today.getDay()) {
                        list.add(c);
                    }
                }
               return list;
            }
        }
        return null;
    }
}
