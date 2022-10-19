package hexlet.code.games;

import hexlet.code.Cli;
import main.java.hexlet.code.Engine;

public class GCDGame {

    public static void startGame() {
        while (Engine.getCounter() < Engine.ROUNDS) {
            int randomNumber = Engine.getRandomNumber();
            int randomNumber2 = Engine.getRandomNumber2();

            System.out.println("Find the greatest common divisor of given numbers.\nQuestion: "
                    + randomNumber + " " + randomNumber2);

            while (randomNumber2 != 0) {
                if (randomNumber > randomNumber2) {
                    randomNumber = randomNumber - randomNumber2;
                } else {
                    randomNumber2 = randomNumber2 - randomNumber;
                }
            }

            int answer = Engine.inputNumber();

            if (randomNumber == answer) {
                System.out.println("Correct");
                Engine.incrementCounter();
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + randomNumber + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                Engine.setCounter(Engine.ROUNDSFORLOSE);
            }
        }
        Engine.congratulations();
    }
}
