package main.java.hexlet.code.utils;

import java.util.Scanner;

public class NameUtils {
    private static final String WELCOME = "Welcome to the Brain Games!"
            + "\nMay I have your name? ";

    public static String askName() {
        String name = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print(WELCOME);
        if (scanner.hasNext()) {
            name = scanner.next();
            System.out.println("Hello, " + name + "!");
        }
        return name;
    }
}
