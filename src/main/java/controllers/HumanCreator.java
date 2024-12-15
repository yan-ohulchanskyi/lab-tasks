package controllers;

import models.Human;
import models.Sex;

public class HumanCreator implements Creator {

    public Human human;

    @Override
    public void create() {
        human = new Human();
        human.firstName = "First Name " + (int)(Math.random() * Integer.MAX_VALUE);
        human.lastName = "Last Name " + (int)(Math.random() * Integer.MAX_VALUE);
        var random = Math.random();
        human.sex = random > 0.5 ? Sex.Male : Sex.Female;
    }
}
