package com.enteam.app.repositories;

import com.enteam.app.ressouces.Course;
import com.enteam.app.ressouces.GroupStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupStudentRepository extends JpaRepository<GroupStudent,Long> {

}
