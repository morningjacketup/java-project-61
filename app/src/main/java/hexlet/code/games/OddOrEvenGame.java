package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class OddOrEvenGame {
    private static final int MAXNUMBER = 100;
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void createGame() {
        String[][] roundsData = new String[3][2];
        for (int i = 0; i < 3; i++) {
            String[] generatedData = generateRoundData();
            roundsData[i] = generatedData;
        }
        Engine.run(QUESTION, roundsData);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[2];
        int randomNumber = Utils.generateRandom(MAXNUMBER);
        roundData[0] = String.valueOf(randomNumber);
        roundData[1] = isEven(randomNumber) ? "yes" : "no";
        return roundData;
    }
}
