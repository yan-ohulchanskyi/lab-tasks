package org.example;

import controllers.UniversityCreator;

public class Main {

    public static void main(String[] args) {
        var runner = new Run(new UniversityCreator());

        var uni = runner.createTypicalUniversity();

        System.out.println("Створен університет: " + uni.name);
    }
}