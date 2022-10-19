package hexlet.code;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.OddOrEvenGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;


import java.util.Scanner;

import static hexlet.code.Cli.greeting;

public class App {
    public static void main(String[] args) {

        System.out.println("Welcome to the Brain Games!");
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
            case 1:
                greeting();
                break;
            case 2:
                greeting();
                OddOrEvenGame.startGame();
                break;
            case 3:
                greeting();
                CalculatorGame.startGame();
                break;
            case 4:
                greeting();
                GCDGame.startGame();
                break;
            case 5:
                greeting();
                ProgressionGame.startGame();
                break;
            case 6:
                greeting();
                PrimeGame.startGame();
                break;
            default:
                break;
        }
    }
}
