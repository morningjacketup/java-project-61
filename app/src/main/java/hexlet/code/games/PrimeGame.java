package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class PrimeGame {
    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAXNUMBER = 100;
    private static final int ROUNDS = 3;
    private static final int QUESTIONARRAY = 0;
    private static final int ANSWERARRAY = 1;

    public static void createGame() {
        String[][] roundsData = new String[ROUNDS][ROUNDS];
        for (int i = 0; i < ROUNDS; i++) {
            String[] generatedData = generateRoundData();
            roundsData[i][0] = generatedData[QUESTIONARRAY];
            roundsData[i][1] = generatedData[ANSWERARRAY];
        }
        Engine.run(QUESTION, roundsData);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int correctNumber = Utils.generateRandom(MAXNUMBER);
        roundData[QUESTIONARRAY] = String.valueOf(correctNumber);
        roundData[ANSWERARRAY] = isPrime(correctNumber) ? "yes" : "no";
        return roundData;
    }
}
