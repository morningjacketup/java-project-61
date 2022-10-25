package hexlet.code.games;

import main.java.hexlet.code.Engine;
import main.java.hexlet.code.utils.NameUtils;
import main.java.hexlet.code.utils.RandomNumberGenerator;

public class CalculatorGame {

    private static final String QUESTION = "What is the result of the expression?";
    private static final int MAXNUMBER = 100;
    private static final int NUMBEROFMATHOPERATIONS = 3;
    private static final int COUNTOFGAMES = 3;
    private static int firstNum;
    private static int secondNum;
    private static char mathOperator;

    public static void startGame() {
        String name = NameUtils.askName();
        String[][] questionAndAnswerArray = new String[COUNTOFGAMES][COUNTOFGAMES];
        for (int i = 0; i < COUNTOFGAMES; i++) {
            questionAndAnswerArray[i][0] = makeQuestion();
            questionAndAnswerArray[i][1] = getSolution(questionAndAnswerArray[i][0]);
        }
        Engine.run(name, QUESTION, questionAndAnswerArray);
    }

    public static String makeQuestion() {
        StringBuilder expression = new StringBuilder();
        firstNum = RandomNumberGenerator.generateRandom(MAXNUMBER);
        expression.append(firstNum).append(" ");
        secondNum = RandomNumberGenerator.generateRandom(MAXNUMBER);
        int mathOperation = RandomNumberGenerator.generateRandom(NUMBEROFMATHOPERATIONS);
        mathOperator = switch (mathOperation) {
            case 0 -> '+';
            case 1 -> '-';
            case 2 -> '*';
            default -> throw new IllegalStateException("Unexpected value: " + mathOperation);
        };
        expression.append(mathOperator).append(" ").append(secondNum);
        return expression.toString();
    }

    public static String getSolution(final String quest) {
        int result = switch (mathOperator) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '*' -> firstNum * secondNum;
            default -> throw new IllegalStateException("Unexpected value: " + quest);
        };
        return String.valueOf(result);
    }
}
