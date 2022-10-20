package hexlet.code.games;

import main.java.hexlet.code.Engine;

public class OddOrEvenGame {

    public static void startGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (Engine.getCounter() < Engine.ROUNDS) {
            int randomNumber = Engine.getRandomNumber();
            System.out.println("Question: " + randomNumber + "\nYour answer: ");
            boolean isEven = randomNumber % 2 == 0;
            String answer = Engine.inputString();
            String correctAnswer = isEven ? "yes" : "no";
            if ((isEven && answer.equals("yes")) || (!isEven && answer.equals("no"))) {
                System.out.println("Correct");
                Engine.incrementCounter();
            } else {
                Engine.gameOver(answer, correctAnswer);
                Engine.setCounter(Engine.ROUNDSFORLOSE);
            }
        }
        Engine.congratulations();
    }
}
