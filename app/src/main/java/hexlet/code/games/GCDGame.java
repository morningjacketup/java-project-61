package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class GCDGame {
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";
    private static final int MAXNUMBER = 100;
    private static final int ROUNDS = 3;

    public static void createGame() {
        Engine.run(QUESTION, generateRoundData());
    }

    public static String calculateGCD(int number, int number2) {
        while (number2 != number) {
            if (number > number2) {
                number = number - number2;
            } else {
                number2 = number2 - number;
            }
        }
        return String.valueOf(number2);
    }

    public static String[][] generateRoundData() {
        String[][] roundsData = new String[ROUNDS][ROUNDS];
        for (int i = 0; i < ROUNDS; i++) {
            int randomNumber = Utils.generateRandom(MAXNUMBER);
            int secondRandomNumber = Utils.generateRandom(MAXNUMBER);
            roundsData[i][0] = randomNumber + " " + secondRandomNumber + " ";
            roundsData[i][1] = calculateGCD(randomNumber, secondRandomNumber);
        }
        return roundsData;
    }
}
