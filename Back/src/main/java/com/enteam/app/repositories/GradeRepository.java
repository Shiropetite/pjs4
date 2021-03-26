package com.enteam.app.repositories;

import com.enteam.app.ressouces.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GradeRepository extends JpaRepository<Grade, Long> {

    public Optional<Grade[]> findGradesByOwner_Id(Long id_student);

}
