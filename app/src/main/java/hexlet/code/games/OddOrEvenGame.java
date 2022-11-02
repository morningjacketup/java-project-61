package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class OddOrEvenGame {
    private static final int MAXNUMBER = 100;
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void createGame() {
        String[][] roundsData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(QUESTION, roundsData);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static String[] generateRoundData() {
        int randomNumber = Utils.generateRandom(MAXNUMBER);
        return new String[]{String.valueOf(randomNumber),
                isEven(randomNumber) ? "yes" : "no"};
    }
}
