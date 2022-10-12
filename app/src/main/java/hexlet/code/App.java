package hexlet.code;


import java.util.Scanner;

import static hexlet.code.CalculatorGame.startCalculatorGame;
import static hexlet.code.Cli.greeting;
import static hexlet.code.OddOrEvenGame.startGame;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit");
        Scanner sc = new Scanner(System.in);
        int numberOfGame = sc.nextInt();
        if (numberOfGame == 0) {
            System.exit(0);
        } else if (numberOfGame == 1) {
            greeting();
        } else if (numberOfGame == 2) {
            greeting();
            startGame();
        } else if (numberOfGame == 3) {
            greeting();
            startCalculatorGame();
        }
    }
}
