package lr3.controllers;

import lr3.models.Group;
import lr3.models.Student;

import java.util.ArrayList;

public class GroupCreator implements Creator {
    public Group group;

    @Override
    public void create() {
        var studentCreator = new StudentCreator();
        var humanCreator = new HumanCreator();

        var students = new ArrayList<Student>();

        var length = (int)(Math.random() * 10) + 2;

        for (int i = 0; i < length; i++) {
            studentCreator.create();
            students.add(studentCreator.student);
        }

        group = new Group();
        group.students = students;
        group.name = "Group #" + (int)(Math.random() * Integer.MAX_VALUE);

        humanCreator.create();
        group.head = humanCreator.human;
    }
}
