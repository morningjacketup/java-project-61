package hexlet.code.games;

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
                Engine.correctAnswer();
                Engine.incrementCounter();
            } else {
                String ans = Integer.toString(answer);
                String exp = Integer.toString(expression);
                Engine.gameOver(ans, exp);
                Engine.setCounter(Engine.ROUNDSFORLOSE);
            }
        }
        Engine.congratulations();
    }
}
