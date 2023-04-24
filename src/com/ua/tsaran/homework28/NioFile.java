package com.ua.tsaran.homework28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioFile {
    private final Path filePath;

    public NioFile(String fileName) {
        this.filePath = Paths.get(fileName);
    }

    public void writeToFile(String text) {
        try {
            Files.write(filePath, text.getBytes());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public String readFromFile() {
        try {
            List<String> lines = Files.readAllLines(filePath);
            return String.join("\n", lines);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        NioFile myFile = new NioFile("data.txt");
        myFile.writeToFile("Тут може бути будь-яка нісенітниця яка прийде мені в голову");

        String text = myFile.readFromFile();
        System.out.println(text);
    }
}
