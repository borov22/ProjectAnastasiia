package com.ua.tsaran.homework25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int number = 0;

        while (!validInput) {
            System.out.println("Please, enter the number: ");
            try {
                number = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error! Incorrect number! Try again, please.");
                scanner.nextLine();
            }
        }

        System.out.println("Number entered: " + number);
    }
}

