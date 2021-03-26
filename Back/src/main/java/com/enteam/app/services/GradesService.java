package com.enteam.app.services;

import com.enteam.app.ressouces.Grade;

public interface GradesService {

    public Grade[] getGrades(Long id_student);
}
