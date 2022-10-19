package hexlet.code;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.OddOrEvenGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;


import java.util.Scanner;

import static hexlet.code.Cli.greeting;

public class App {

    public static final int GREETINGS = 1;
    public static final int EVEN = 2;
    public static final int CALCULATOR = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calculator\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        Scanner sc = new Scanner(System.in);
        int numberOfGame = sc.nextInt();
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
