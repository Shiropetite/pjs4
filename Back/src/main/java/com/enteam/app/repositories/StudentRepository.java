package com.enteam.app.repositories;

import com.enteam.app.ressouces.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    /*
    @Query("SELECT s.id FROM Student s WHERE s.email = :email AND s.password = :password")
    public Optional<Student> findByLoginAndPassword(String login, String password);
     */
}
