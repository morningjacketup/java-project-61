package hexlet.code.games;

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
                Engine.correctAnswer();
                Engine.incrementCounter();
            } else {
                String num = Integer.toString(randomNumber);
                String ans = Integer.toString(answer);
                Engine.gameOver(ans, num);
                Engine.setCounter(Engine.ROUNDSFORLOSE);
            }
        }
        Engine.congratulations();
    }
}
