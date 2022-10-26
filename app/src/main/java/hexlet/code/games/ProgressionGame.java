package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.utils.RandomNumberGenerator;

public class ProgressionGame {
    private static final String QUESTION = "What number is missing in the progression?";
    private static final int MAXNUMBER = 100;
    private static final int COUNTOFGAMES = 3;
    private static final int COUNTOFARRAYSIZE = 10;
    private static final int MAXSTEP = 5;
    private static int step;
    private static int randomIndex;
    private static int randomStart;
    private static int[] list;
    public static void createGame() {
        String[][] questionAndAnswerArray = new String[COUNTOFGAMES][COUNTOFGAMES];
        for (int i = 0; i < COUNTOFGAMES; i++) {
            questionAndAnswerArray[i][0] = makeQuestion();
            questionAndAnswerArray[i][1] = getSolution();
        }
        Engine.run(QUESTION, questionAndAnswerArray);
    }

    public static String makeQuestion() {
        StringBuilder sb = new StringBuilder();
        step = RandomNumberGenerator.generateRandom(MAXSTEP) + 1;
        randomIndex = RandomNumberGenerator.generateRandom(COUNTOFARRAYSIZE);
        randomStart = RandomNumberGenerator.generateRandom(MAXNUMBER);
        list = new int[COUNTOFARRAYSIZE];
        for (int i = 0; i < COUNTOFARRAYSIZE; i++) {
            list[i] = randomStart;
            randomStart += step;
        }
        for (int i = 0; i < randomIndex; i++) {
            sb.append(list[i] + " ");
        }
        sb.append(".. ");
        for (int i = randomIndex + 1; i < list.length - 1; i++) {
            sb.append(list[i] + " ");
        }
        return sb.toString();
    }

    public static String getSolution() {
        int result = list[randomIndex];
        return String.valueOf(result);
    }

}
