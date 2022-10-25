package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.utils.NameUtils;
import main.java.hexlet.code.utils.RandomNumberGenerator;

public class OddOrEvenGame {
    private static final int MAXNUMBER = 100;
    private static final int COUNTOFGAMES = 3;
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startGame() {
        String name = NameUtils.askName();
        String[][] questionAndAnswerArray = new String[COUNTOFGAMES][COUNTOFGAMES];
        for (int i = 0; i < COUNTOFGAMES; i++) {
            questionAndAnswerArray[i][0] = makeQuestion();
            questionAndAnswerArray[i][1] = getSolution(Integer.parseInt(questionAndAnswerArray[i][0]));
        }
        Engine.run(name, QUESTION, questionAndAnswerArray);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String makeQuestion() {
        int randomNumber = RandomNumberGenerator.generateRandom(MAXNUMBER);
        return String.valueOf(randomNumber);
    }

    public static String getSolution(final int number) {
        String correctAnswer = isEven(number) ? "yes" : "no";
        return correctAnswer;
    }


}
