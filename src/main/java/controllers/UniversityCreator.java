package controllers;

import models.Department;
import models.Faculty;
import models.University;

import java.util.ArrayList;

public class UniversityCreator implements Creator {

    public University university;

    @Override
    public void create() {
        var departmentCreator = new DepartmentCreator();
        var humanCreator = new HumanCreator();

        var departments = new ArrayList<Department>();

        var length = (int)(Math.random() * 3) + 1;

        for (int i = 0; i < length; i++) {
            departmentCreator.create();
            departments.add(departmentCreator.department);
        }

        university = new University();
        university.departments = departments;

        university.name = "University #" + (int)(Math.random() * Integer.MAX_VALUE);

        humanCreator.create();
        university.head = humanCreator.human;
    }
}
