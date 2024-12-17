package models;

import lr4.controllers.UniversityCreator;
import lr4.presentation.JsonManager;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class UniversityTest {
    @Test
    public void testJsonOperations() throws IOException {
        // Arrange

        var jsonManager = new JsonManager();
        var universityCreator = new UniversityCreator();

        // Act
        universityCreator.create();
        var oldUniversity = universityCreator.university;
        jsonManager.writeUniversityToJsonFile(oldUniversity, "uni.json");

        var newUniversity = jsonManager.readUniversityFromJsonFile("uni.json");

        // Assert

        assertEquals(oldUniversity, newUniversity);
    }
}