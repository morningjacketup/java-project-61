package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.Utils;

public class CalculatorGame {
    private static final String QUESTION = "What is the result of the expression?";
    private static final int MAXNUMBER = 100;
    private static final int NUMBEROFMATHOPERATIONS = 3;
    private static final int ROUNDS = 3;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void createGame() {
        Engine.run(QUESTION, generateRoundData());
    }

    public static String makeQuestion(int firstNumber, int secondNumber, char operator) {
        return firstNumber + " " + operator + " " + secondNumber;
    }

    public static String calculate(int firstNumber, int secondNumber, char operator) {
        int result = switch (operator) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
        return String.valueOf(result);
    }

    public static String[][] generateRoundData() {
        String[][] roundsData = new String[ROUNDS][ROUNDS];
        for (int i = 0; i < ROUNDS; i++) {
            int firstNumber = Utils.generateRandom(MAXNUMBER);
            int secondNumber = Utils.generateRandom(MAXNUMBER);
            int mathOperator = Utils.generateRandom(NUMBEROFMATHOPERATIONS);
            char operator = OPERATORS[mathOperator];
            roundsData[i][0] = makeQuestion(firstNumber, secondNumber, operator);
            roundsData[i][1] = calculate(firstNumber, secondNumber, operator);
        }
        return roundsData;
    }
}
