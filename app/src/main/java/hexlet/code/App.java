package hexlet.code;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.OddOrEvenGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

import static hexlet.code.Cli.greet;

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
        while (!sc.hasNextInt()) {
            sc.next();
        }
        int numberOfGame = sc.nextInt();
        System.out.println("Your choice: " + numberOfGame);
        switch (numberOfGame) {
            case GREETINGS -> greet();
            case EVEN -> OddOrEvenGame.createGame();
            case CALCULATOR -> CalculatorGame.createGame();
            case GCD -> GCDGame.createGame();
            case PROGRESSION -> ProgressionGame.createGame();
            case PRIME -> PrimeGame.createGame();
            default -> {
                System.out.println("Enter number from 1 - 6");
            }
        }
        sc.close();
    }

}
