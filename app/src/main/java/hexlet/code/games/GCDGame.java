package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.utils.NameUtils;
import main.java.hexlet.code.utils.RandomNumberGenerator;

public class GCDGame {
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";
    private static final int MAXNUMBER = 100;
    private static final int COUNTOFGAMES = 3;
    private static int randomNumber;
    private static int secondRandomNumber;
    public static void startGame() {
        String name = NameUtils.askName();
        String[][] questionAndAnswerArray = new String[COUNTOFGAMES][COUNTOFGAMES];
        for (int i = 0; i < COUNTOFGAMES; i++) {
            questionAndAnswerArray[i][0] = makeQuestion();
            questionAndAnswerArray[i][1] = getSolution();
        }
        Engine.run(name, QUESTION, questionAndAnswerArray);
    }

    public static String makeQuestion() {
        randomNumber = RandomNumberGenerator.generateRandom(MAXNUMBER);
        secondRandomNumber = RandomNumberGenerator.generateRandom(MAXNUMBER);
        return randomNumber + " " + secondRandomNumber;
    }

    public static String getSolution() {
        if (randomNumber == 0) {
            return String.valueOf(secondRandomNumber);
        }

        if (secondRandomNumber == 0) {
            return String.valueOf(randomNumber);
        }

        while (secondRandomNumber != randomNumber) {
            if (randomNumber > secondRandomNumber) {
                randomNumber = randomNumber - secondRandomNumber;
            } else {
                secondRandomNumber = secondRandomNumber - randomNumber;
            }
        }
        return String.valueOf(secondRandomNumber);
    }
}
