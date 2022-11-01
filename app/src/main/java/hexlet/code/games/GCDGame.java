package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class GCDGame {
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";
    private static final int MAXNUMBER = 100;
    private static final int ROUNDS = 3;
    private static final int QUESTIONINDEX = 0;
    private static final int ANSWERINDEX = 1;

    public static void createGame() {
        String[][] roundsData = new String[ROUNDS][ROUNDS];
        for (int i = 0; i < ROUNDS; i++) {
            String[] generatedData = generateRoundData();
            roundsData[i] = generatedData;
        }
        Engine.run(QUESTION, roundsData);
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

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int randomNumber = Utils.generateRandom(MAXNUMBER);
        int secondRandomNumber = Utils.generateRandom(MAXNUMBER);
        roundData[QUESTIONINDEX] = secondRandomNumber + " " + randomNumber;
        roundData[ANSWERINDEX] = calculateGCD(randomNumber, secondRandomNumber);
        return roundData;
    }
}
