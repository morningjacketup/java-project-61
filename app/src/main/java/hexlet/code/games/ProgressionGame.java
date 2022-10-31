package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class ProgressionGame {
    private static final String QUESTION = "What number is missing in the progression?";
    private static final int MAXNUMBER = 100;
    private static final int ROUNDS = 3;
    private static final int COUNTOFARRAYSIZE = 10;
    private static final int MAXSTEP = 5;
    private static final int QUESTIONARRAY = 0;
    private static final int ANSWERARRAY = 1;

    public static void createGame() {
        String[][] roundsData = new String[ROUNDS][ROUNDS];
        for (int i = 0; i < ROUNDS; i++) {
            roundsData[i][0] = generateRoundData()[QUESTIONARRAY];
            roundsData[i][1] = generateRoundData()[ANSWERARRAY];
        }
        Engine.run(QUESTION, roundsData);
    }

    public static String makeQuestion(int[] list, int index) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            sb.append(list[i] + " ");
        }
        sb.append(".. ");
        for (int i = index + 1; i < list.length - 1; i++) {
            sb.append(list[i] + " ");
        }
        return sb.toString();
    }

    public static int[] generateProgression(int start, int step) {
        int[] list = new int[COUNTOFARRAYSIZE];
        for (int i = 0; i < COUNTOFARRAYSIZE; i++) {
            list[i] = start;
            start += step;
        }
        return list;
    }

    public static String getSolution(int index, int[] list) {
        int result = list[index];
        return String.valueOf(result);
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int step = Utils.generateRandom(MAXSTEP) + 1;
        int randomIndex = Utils.generateRandom(COUNTOFARRAYSIZE);
        int randomStart = Utils.generateRandom(MAXNUMBER);
        int[] list = generateProgression(randomStart, step);
        roundData[QUESTIONARRAY] = makeQuestion(list, randomIndex);
        roundData[ANSWERARRAY] = getSolution(randomIndex, list);
        return roundData;
    }
}
