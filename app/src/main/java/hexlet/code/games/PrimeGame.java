package hexlet.code.games;

import hexlet.code.Cli;
import main.java.hexlet.code.Engine;

public class PrimeGame {

    public static void startGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (Engine.counter < Engine.ROUNDS) {
            int correctNumber = Engine.getRandomNumber2();

            System.out.println("Question: " + correctNumber);

            String correctAnswer;

            if (isPrime(correctNumber)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            String answer = Engine.inputString();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct");
                Engine.counter++;
            } else {
                System.out.println("'" + answer + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'"
                        + correctAnswer + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                Engine.counter += Engine.ROUNDSFORLOSE;
            }
        }
        Engine.congratulations();
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
