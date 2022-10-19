package hexlet.code.games;

import hexlet.code.Cli;
import main.java.hexlet.code.Engine;

public class OddOrEvenGame {

    public static void startGame() {
        String correctAnswer;
        String currentAnswer;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (Engine.getCounter() < Engine.ROUNDS) {
            int randomNumber = Engine.getRandomNumber();
            System.out.println("Question: " + randomNumber + "\nYour answer: ");

            boolean isEven = randomNumber % 2 == 0;

            String answer = Engine.inputString();

            if (isEven) {
                correctAnswer = "yes";
                currentAnswer = answer;
            } else {
                correctAnswer = "no";
                currentAnswer = answer;
            }

            if ((isEven && answer.equals("yes")) || (!isEven && answer.equals("no"))) {
                System.out.println("Correct");
                Engine.incrementCounter();
            } else {
                System.out.println("'" + currentAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                Engine.setCounter(Engine.ROUNDSFORLOSE);
            }
        }
        Engine.congratulations();
    }
}
