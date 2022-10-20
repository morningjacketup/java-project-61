package hexlet.code.games;

import main.java.hexlet.code.Engine;

public class PrimeGame {

    public static void startGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (Engine.getCounter() < Engine.ROUNDS) {
            int correctNumber = Engine.getRandomNumber2();

            System.out.println("Question: " + correctNumber);

            String correctAnswer = isPrime(correctNumber) ? "yes" : "no";
            String answer = Engine.inputString();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct");
                Engine.incrementCounter();
            } else {
                Engine.gameOver(correctAnswer, answer);
                Engine.setCounter(Engine.ROUNDSFORLOSE);
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
