package hexlet.code;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.OddOrEvenGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;
import main.java.hexlet.code.Engine;

import static hexlet.code.Cli.greeting;
import static main.java.hexlet.code.Engine.inputNumber;

public class App {
    public static final int GREETINGS = 1;
    public static final int EVEN = 2;
    public static final int CALCULATOR = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static void main(String[] args) {
        Engine.greetingsText();
        int numberOfGame = inputNumber();

        switch (numberOfGame) {
            case GREETINGS:
                greeting();
                break;
            case EVEN:
                greeting();
                OddOrEvenGame.startGame();
                break;
            case CALCULATOR:
                greeting();
                CalculatorGame.startGame();
                break;
            case GCD:
                greeting();
                GCDGame.startGame();
                break;
            case PROGRESSION:
                greeting();
                ProgressionGame.startGame();
                break;
            case PRIME:
                greeting();
                PrimeGame.startGame();
                break;
            default:
                break;
        }
    }
}
