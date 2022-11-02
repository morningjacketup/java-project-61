package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class GCDGame {
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";
    private static final int MAXNUMBER = 100;

    public static void createGame() {
        Engine.run(QUESTION, generateRoundsData());
    }

    private static int calculateGCD(int number, int number2) {
        while (number2 != number) {
            if (number > number2) {
                number = number - number2;
            } else {
                number2 = number2 - number;
            }
        }
        return number2;
    }

    private static String[] generateRoundData() {
        int randomNumber = Utils.generateRandom(MAXNUMBER);
        int secondRandomNumber = Utils.generateRandom(MAXNUMBER);
        return new String[]{randomNumber + " " + secondRandomNumber,
                String.valueOf(calculateGCD(randomNumber, secondRandomNumber))};
    }

    private static String[][] generateRoundsData() {
        String[][] roundsData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        return roundsData;
    }
}
