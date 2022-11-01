package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class CalculatorGame {
    private static final String QUESTION = "What is the result of the expression?";
    private static final int MAXNUMBER = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void createGame() {
        String[][] roundsData = new String[3][2];
        for (int i = 0; i < 3; i++) {
            String[] generatedData = generateRoundData();
            roundsData[i] = generatedData;
        }
        Engine.run(QUESTION, roundsData);
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
        String[] roundData = new String[2];
        int firstNumber = Utils.generateRandom(MAXNUMBER);
        int secondNumber = Utils.generateRandom(MAXNUMBER);
        int mathOperator = Utils.generateRandom(3);
        char operator = OPERATORS[mathOperator];
        roundData[0] = firstNumber + " " + operator + " " + secondNumber;
        roundData[1] = String.valueOf(calculate(firstNumber, secondNumber, operator));
        return roundData;
    }
}
