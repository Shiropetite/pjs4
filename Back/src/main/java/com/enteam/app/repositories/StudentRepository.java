package com.enteam.app.repositories;

import com.enteam.app.ressouces.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    public Optional<Student> findStudentByEmailAndPassword(String login, String password);

}
