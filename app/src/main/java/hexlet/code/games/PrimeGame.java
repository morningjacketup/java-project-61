package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class PrimeGame {
    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAXNUMBER = 100;

    public static void createGame() {
        String[][] roundsData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(QUESTION, roundsData);
    }

    private static boolean isPrime(int number) {
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

    private static String[] generateRoundData() {
        String[] roundData = new String[2];
        int correctNumber = Utils.generateRandom(MAXNUMBER);
        roundData[0] = String.valueOf(correctNumber);
        roundData[1] = isPrime(correctNumber) ? "yes" : "no";
        return roundData;
    }
}
