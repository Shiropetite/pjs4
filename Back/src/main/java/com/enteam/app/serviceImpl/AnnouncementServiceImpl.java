package com.enteam.app.serviceImpl;

import com.enteam.app.repositories.AnnouncementRepository;
import com.enteam.app.repositories.StudentRepository;
import com.enteam.app.ressouces.Announcement;
import com.enteam.app.ressouces.Student;
import com.enteam.app.services.AnnouncementService;

import java.util.*;

public class AnnouncementServiceImpl implements AnnouncementService {
    private AnnouncementRepository announcementRepository;
    private StudentRepository studentRepository;

    public AnnouncementServiceImpl(AnnouncementRepository announcementRepository, StudentRepository studentRepository) {
        this.announcementRepository = announcementRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Announcement> getAnnouncements(long id_student) {
        Optional<Student> student = this.studentRepository.findById(id_student);
        if (student.isPresent()) {
            Optional<Announcement[]> announcements = this.announcementRepository.findAnnouncementsByGroupsContaining(student.get().getStudentGroup());
            if (announcements.isPresent()) {
                List<Announcement> list = new ArrayList<>();
                for (Announcement a : announcements.get()) {
                    list.add(a);
                }
                return list;
            }
        }
        return null;
    }
}
