package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class ProgressionGame {
    private static final String QUESTION = "What number is missing in the progression?";
    private static final int MAXNUMBER = 100;
    private static final int ROUNDS = 3;
    private static final int COUNTOFARRAYSIZE = 10;
    private static final int MAXSTEP = 5;
    private static int[] list;

    public static void createGame() {
        Engine.run(QUESTION, generateRoundData());
    }

    public static String makeQuestion(int index, int start, int step) {
        StringBuilder sb = new StringBuilder();
        list = new int[COUNTOFARRAYSIZE];
        for (int i = 0; i < COUNTOFARRAYSIZE; i++) {
            list[i] = start;
            start += step;
        }
        for (int i = 0; i < index; i++) {
            sb.append(list[i] + " ");
        }
        sb.append(".. ");
        for (int i = index + 1; i < list.length - 1; i++) {
            sb.append(list[i] + " ");
        }
        return sb.toString();
    }

    public static String getSolution(int index) {
        int result = list[index];
        return String.valueOf(result);
    }

    public static String[][] generateRoundData() {
        String[][] roundsData = new String[ROUNDS][ROUNDS];
        for (int i = 0; i < ROUNDS; i++) {
            int step = Utils.generateRandom(MAXSTEP) + 1;
            int randomIndex = Utils.generateRandom(COUNTOFARRAYSIZE);
            int randomStart = Utils.generateRandom(MAXNUMBER);
            roundsData[i][0] = makeQuestion(randomIndex, randomStart, step);
            roundsData[i][1] = getSolution(randomIndex);
        }
        return roundsData;
    }
}
