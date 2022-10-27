package main.java.hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS = 3;
    private static final String WELCOME = "Welcome to the Brain Games!"
            + "\nMay I have your name? ";

    public static void run(String description, String[][] roundsData) {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        String name = askName();
        String input = "";
        System.out.println(description);
        for (int i = 0; i < ROUNDS; i++) {
            String answer = roundsData[i][1];
            String question = "Question: " + roundsData[i][0] + "\nYour answer: ";
            System.out.print(question);
            input = sc.next();
            if (input.equals(answer)) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println("'"
                        + input
                        + "' is wrong answer ;(. Correct answer was '"
                        + answer
                        + "'\nLet's try again, "
                        + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

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

