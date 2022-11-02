package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class PrimeGame {
    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAXNUMBER = 100;

    public static void createGame() {
        Engine.run(QUESTION, generateRoundsData());
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
        int correctNumber = Utils.generateRandom(MAXNUMBER);
        return new String[]{String.valueOf(correctNumber), isPrime(correctNumber) ? "yes" : "no"};
    }

    private static String[][] generateRoundsData() {
        String[][] roundsData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        return roundsData;
    }
}
