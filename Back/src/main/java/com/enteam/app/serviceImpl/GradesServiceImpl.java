package com.enteam.app.serviceImpl;

import com.enteam.app.repositories.GradeRepository;
import com.enteam.app.ressouces.Grade;
import com.enteam.app.services.GradesService;

import java.util.Optional;

public class GradesServiceImpl implements GradesService {
   private GradeRepository gradeRepository;

    public GradesServiceImpl(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    @Override
    public Grade[] getGrades(Long id_student) {
        Optional<Grade[]> grades = this.gradeRepository.findGradesByOwner_Id(id_student);
        return grades.orElse(null);
    }
}
