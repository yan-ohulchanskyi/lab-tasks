package org.example;

import controllers.UniversityCreator;
import models.University;

public class Run {

    private final UniversityCreator _universityCreator;

    public Run(UniversityCreator universityCreator) {
        _universityCreator = universityCreator;
    }

    public University createTypicalUniversity() {
        _universityCreator.create();
        return _universityCreator.university;
    }
}
