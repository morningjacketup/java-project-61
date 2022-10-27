package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class PrimeGame {
    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAXNUMBER = 100;
    private static final int ROUNDS = 3;

    public static void createGame() {
        Engine.run(QUESTION, generateRoundData());
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

    public static String[][] generateRoundData() {
        String[][] roundsData = new String[ROUNDS][ROUNDS];
        for (int i = 0; i < ROUNDS; i++) {
            int correctNumber = Utils.generateRandom(MAXNUMBER);
            roundsData[i][0] = String.valueOf(correctNumber);
            roundsData[i][1] = isPrime(correctNumber) ? "yes" : "no";
        }
        return roundsData;
    }
}
