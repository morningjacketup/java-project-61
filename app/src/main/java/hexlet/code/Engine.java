package main.java.hexlet.code;

import java.util.Scanner;

public class Engine {
    private static int counter = 0;
    private static final int ROUNDS = 3;
    private static String input;
    private String[][] questionAndAnswerArray;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String WRONG = "' is wrong answer ;(. Correct answer was '";
    private static final String AGAIN = "'\nLet's try again, ";

    public static void run(String userName, String gameQuestion, String[][] questionAndAnswerArray) {
        System.out.println(gameQuestion);
        for (int i = 0; i < ROUNDS; i++) {
            String answer = questionAndAnswerArray[i][1];
            System.out.print("Question: " + questionAndAnswerArray[i][0] + "\nYour answer: ");
            input = SCANNER.next();
            if (input.equals(answer)) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println("'" + input + WRONG + answer + AGAIN + userName + "!");
                break;
            }
        }
        congratulation(userName);
    }

    public static void congratulation(String userName) {
        if (counter == ROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}

