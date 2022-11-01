package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class GCDGame {
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";
    private static final int MAXNUMBER = 100;

    public static void createGame() {
        String[][] roundsData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < roundsData.length; i++) {
            String[] generatedData = generateRoundData();
            roundsData[i] = generatedData;
        }
        Engine.run(QUESTION, roundsData);
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
        String[] roundData = new String[2];
        int randomNumber = Utils.generateRandom(MAXNUMBER);
        int secondRandomNumber = Utils.generateRandom(MAXNUMBER);
        roundData[0] = randomNumber + " " + secondRandomNumber;
        roundData[1] = String.valueOf(calculateGCD(randomNumber, secondRandomNumber));
        return roundData;
    }
}
