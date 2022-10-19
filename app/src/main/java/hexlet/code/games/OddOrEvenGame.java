package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class OddOrEvenGame {

    public static void startGame() {
        int counter = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String correctAnswer;
        String currentAnswer;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (counter < 3) {
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber + "\nYour answer: ");


            boolean isEven = randomNumber % 2 == 0;

            String answer = sc.nextLine();

            if (isEven) {
                correctAnswer = "yes";
                currentAnswer = answer;
            } else {
                correctAnswer = "no";
                currentAnswer = answer;
            }

            if ((isEven && answer.equals("yes")) || (!isEven && answer.equals("no"))) {
                System.out.println("Correct");
                counter++;
            } else {
                System.out.println("'" + currentAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'");
                counter += 5;
            }
        }

        if (counter == 3) {
            System.out.println("Congratulation " + Cli.getName() + "!");
        }
    }
}
