package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class OddOrEvenGame {
    private static final int MAXNUMBER = 100;
    private static final int ROUNDS = 3;
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void createGame() {
        Engine.run(QUESTION, generateRoundData());
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean getSolution(int number) {
        return isEven(number) ? true : false;
    }

    public static String[][] generateRoundData() {
        String[][] roundsData = new String[ROUNDS][ROUNDS];
        for (int i = 0; i < ROUNDS; i++) {
            int randomNumber = Utils.generateRandom(MAXNUMBER);
            roundsData[i][0] = String.valueOf(randomNumber);
            roundsData[i][1] = isEven(randomNumber) ? "yes" : "no";
        }
        return roundsData;
    }
}
