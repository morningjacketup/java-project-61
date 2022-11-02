package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class CalculatorGame {
    private static final String QUESTION = "What is the result of the expression?";
    private static final int MAXNUMBER = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void createGame() {
        Engine.run(QUESTION, generateRoundsData());
    }

    private static int calculate(int firstNumber, int secondNumber, char operator) {
        int result = switch (operator) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
        return result;
    }

    private static String[] generateRoundData() {
        int firstNumber = Utils.generateRandom(MAXNUMBER);
        int secondNumber = Utils.generateRandom(MAXNUMBER);
        int mathOperator = Utils.generateRandom(OPERATORS.length);
        char operator = OPERATORS[mathOperator];
        return new String[]{firstNumber + " " + operator + " " + secondNumber,
                String.valueOf(calculate(firstNumber, secondNumber, operator))};
    }

    private static String[][] generateRoundsData() {
        String[][] roundsData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        return roundsData;
    }
}
