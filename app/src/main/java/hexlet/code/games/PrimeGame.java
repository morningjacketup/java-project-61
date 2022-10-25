package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.utils.NameUtils;
import main.java.hexlet.code.utils.RandomNumberGenerator;

public class PrimeGame {
    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAXNUMBER = 100;
    private static final int COUNTOFGAMES = 3;

    public static void startGame() {
        String name = NameUtils.askName();
        String[][] questionAndAnswerArray = new String[COUNTOFGAMES][COUNTOFGAMES];
        for (int i = 0; i < COUNTOFGAMES; i++) {
            questionAndAnswerArray[i][0] = makeQuestion();
            questionAndAnswerArray[i][1] = getSolution(Integer.parseInt(questionAndAnswerArray[i][0]));
        }
        Engine.run(name, QUESTION, questionAndAnswerArray);
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

    public static String makeQuestion() {
        int correctNumber = RandomNumberGenerator.generateRandom(MAXNUMBER);
        return String.valueOf(correctNumber);
    }

    public static String getSolution(final int correctNumber) {
        return isPrime(correctNumber) ? "yes" : "no";
    }
}
