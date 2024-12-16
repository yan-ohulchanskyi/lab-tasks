package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.University;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonManager {

    public void writeUniversityToJsonFile(University university, String filepath) throws IOException {
        try {
            var file = new File(filepath);
            var objectMapper = new ObjectMapper();
            file.createNewFile();

            var fileWriter = new FileWriter(filepath);

            fileWriter.write(objectMapper.writeValueAsString(university));

            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Не вдалось створити і записати json у файл. " + e.getMessage());
            throw e;
        }
    }

    public University readUniversityFromJsonFile(String filepath) throws IOException {
        try {
            var objectMapper = new ObjectMapper();

            var content = Files.readString(Paths.get(filepath));

            return objectMapper.readValue(content, University.class);
        } catch (IOException e) {
            System.out.println("Не вдалося зчитати json файл. " + e.getMessage());
            throw e;
        }
    }
}
