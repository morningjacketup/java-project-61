package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class PrimeGame {

    public static void startGame() {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int counter = 0;

        while (counter < 3) {
            int correctNumber = random.nextInt(100);

            System.out.println("Question: " + correctNumber);

            String correctAnswer;

            if (isPrime(correctNumber)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            String answer = sc.nextLine();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct");
                counter++;
            } else {
                System.out.println("'" + answer + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'"
                        + correctAnswer + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                counter += 3;
            }
        }

        if (counter == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }


    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
