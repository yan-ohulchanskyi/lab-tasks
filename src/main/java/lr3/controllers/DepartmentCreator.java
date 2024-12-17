package lr3.controllers;

import lr3.models.Department;
import lr3.models.Faculty;

import java.util.ArrayList;

public class DepartmentCreator implements Creator {

    public Department department;

    @Override
    public void create() {
        var facultyCreator = new FacultyCreator();
        var humanCreator = new HumanCreator();

        var faculties = new ArrayList<Faculty>();

        var length = (int)(Math.random() * 4) + 2;

        for (int i = 0; i < length; i++) {
            facultyCreator.create();
            faculties.add(facultyCreator.faculty);
        }

        department = new Department();
        department.faculties = faculties;

        department.name = "Department #" + (int)(Math.random() * Integer.MAX_VALUE);

        humanCreator.create();
        department.head = humanCreator.human;
    }
}
