package lr4.controllers;

import lr4.models.Faculty;
import lr4.models.Group;

import java.util.ArrayList;

public class FacultyCreator implements Creator {
    public Faculty faculty;

    @Override
    public void create() {
        var groupCreator = new GroupCreator();
        var humanCreator = new HumanCreator();

        var groups = new ArrayList<Group>();

        var length = (int)(Math.random() * 4) + 2;

        for (int i = 0; i < length; i++) {
            groupCreator.create();
            groups.add(groupCreator.group);
        }

        faculty = new Faculty();
        faculty.groups = groups;

        faculty.name = "Faculty #" + (int)(Math.random() * Integer.MAX_VALUE);

        humanCreator.create();
        faculty.head = humanCreator.human;
    }
}
