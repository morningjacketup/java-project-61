package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class ProgressionGame {
    private static final String QUESTION = "What number is missing in the progression?";
    private static final int MAXNUMBER = 100;
    private static final int RANDOMINDEX = 10;
    private static final int SIZEOFARRAY = 10;
    private static final int RANDOMSTEP = 5;

    public static void createGame() {
        String[][] roundsData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(QUESTION, roundsData);
    }

    private static String makeQuestion(int[] list, int index) {
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

    private static int[] generateProgression(int start, int step) {
        int[] list = new int[SIZEOFARRAY];
        for (int i = 0; i < list.length; i++) {
            list[i] = start;
            start += step;
        }
        return list;
    }

    private static String[] generateRoundData() {
        int step = Utils.generateRandom(RANDOMSTEP) + 1;
        int randomIndex = Utils.generateRandom(RANDOMINDEX);
        int randomStart = Utils.generateRandom(MAXNUMBER);
        int[] list = generateProgression(randomStart, step);
        return new String[]{makeQuestion(list, randomIndex),
                String.valueOf(list[randomIndex])};
    }
}
