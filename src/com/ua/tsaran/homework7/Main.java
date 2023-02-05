package com.ua.tsaran.homework7;

public class Main {
    public static void main(String[] args) {
        int number = 3;
        int powNumber = 3;
        int pow = getPow(number, powNumber);
        System.out.println(pow);

        int star = 22;
        printStar(star);

        int symbol = 7;
        char sym = '\u2764';
        printSymbol(symbol, sym);
    }


    static int getPow(int number, int powNumber) {
        if (powNumber == 1) {
            return number;
        } else {
            return number * getPow(number, powNumber - 1);
        }
    }

    static void printStar(int star) {
        for(int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printSymbol(int symbol, char sym) {
        for(int j = 0; j < symbol; j++) {
            System.out.print(sym);
        }
        System.out.println();
    }
}
