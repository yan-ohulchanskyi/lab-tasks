package lr4.presentation;

import lr4.controllers.UniversityCreator;
import lr4.models.University;

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
