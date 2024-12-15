package controllers;

import models.Student;

public class StudentCreator implements Creator {
    public Student student;

    @Override
    public void create() {
        var humanCreator = new HumanCreator();
        humanCreator.create();

        var human = humanCreator.human;

        student = new Student();

        student.firstName = human.firstName;
        student.lastName = human.lastName;
        student.middleName = human.middleName;
        student.sex = human.sex;
    }
}
