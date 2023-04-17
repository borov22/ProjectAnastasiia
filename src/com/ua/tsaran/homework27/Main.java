package com.ua.tsaran.homework27;

import java.io.*;
import java.io.IOException;

public class Main {
    public static void saveToFile(String fileName, String data) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
        public static String readFromFile(String fileName) {
            StringBuilder data = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    data.append(line).append("\n");
                }
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
            return data.toString();
        }
        public static void main(String[] args) {
            String fileName = "data.txt";
            String dataToSave = "Весело по полю бігає кабанчик!";
            saveToFile(fileName, dataToSave);

            String dataFileRead = readFromFile(fileName);
            System.out.println(dataFileRead);
    }
}
