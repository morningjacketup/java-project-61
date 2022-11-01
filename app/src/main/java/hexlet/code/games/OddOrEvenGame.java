package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class OddOrEvenGame {
    private static final int MAXNUMBER = 100;
    private static final int ROUNDS = 3;
    private static final int QUESTIONINDEX = 0;
    private static final int ANSWERINDEX = 1;
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void createGame() {
        String[][] roundsData = new String[ROUNDS][ROUNDS];
        for (int i = 0; i < ROUNDS; i++) {
            String[] generatedData = generateRoundData();
            roundsData[i] = generatedData;
        }
        Engine.run(QUESTION, roundsData);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int randomNumber = Utils.generateRandom(MAXNUMBER);
        roundData[QUESTIONINDEX] = String.valueOf(randomNumber);
        roundData[ANSWERINDEX] = isEven(randomNumber) ? "yes" : "no";
        return roundData;
    }
}
