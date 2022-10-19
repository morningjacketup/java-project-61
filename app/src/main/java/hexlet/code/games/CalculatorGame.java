package hexlet.code.games;

import hexlet.code.Cli;
import main.java.hexlet.code.Engine;

public class CalculatorGame {

    public static void startGame() {
        String[] operation = {"+", "-", "*"};
        System.out.println("What is the result of the expression?");

        while (Engine.getCounter() < Engine.ROUNDS) {
            int randomNumber1 = Engine.getRandomNumber();
            int randomNumber2 = Engine.getRandomNumber2();
            int randomIndex = Engine.getRandomIndexForCalculator();

            int expression = 0;

            if (randomIndex == 0) {
                expression = randomNumber1 + randomNumber2;
            }
            if (randomIndex == 1) {
                expression = randomNumber1 - randomNumber2;
            }
            if (randomIndex == 2) {
                expression = randomNumber1 * randomNumber2;
            }

            System.out.println("Question: " + randomNumber1 + " " + operation[randomIndex] + " " + randomNumber2);
            int answer = Engine.inputNumber();

            if (answer == expression) {
                System.out.println("Correct");
                Engine.incrementCounter();
            } else {
                System.out.println("'" + answer + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + expression + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                Engine.setCounter(Engine.ROUNDSFORLOSE);
            }
        }
        Engine.congratulations();
    }
}
