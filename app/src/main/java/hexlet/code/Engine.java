package main.java.hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final String WELCOME = "Welcome to the Brain Games!"
            + "\nMay I have your name? ";

    public static void run(String description, String[][] roundsData) {
        Scanner sc = new Scanner(System.in);
        System.out.print(WELCOME);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(description);
        for (int i = 0; i < roundsData.length; i++) {
            String answer = roundsData[i][1];
            String question = "Question: " + roundsData[i][0] + "\nYour answer: ";
            System.out.print(question);
            String input = sc.next();
            if (input.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + input + "' is wrong answer ;(. Correct answer was '" + answer);
                System.out.println("'\nLet's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
