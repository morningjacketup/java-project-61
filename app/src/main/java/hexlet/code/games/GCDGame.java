package hexlet.code.games;

import hexlet.code.Cli;
import main.java.hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCDGame {

    public static void startGame() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        while (counter < Engine.ROUNDS) {
            int randomNumber = random.nextInt(Engine.START, Engine.RANDOMNUMBER);
            int randomNumber2 = random.nextInt(Engine.START, Engine.RANDOMSECONDNUMBER);

            System.out.println("Find the greatest common divisor of given numbers.\nQuestion: "
                    + randomNumber + " " + randomNumber2);

            while (randomNumber2 != 0) {
                if (randomNumber > randomNumber2) {
                    randomNumber = randomNumber - randomNumber2;
                } else {
                    randomNumber2 = randomNumber2 - randomNumber;
                }
            }

            int answer = sc.nextInt();

            if (randomNumber == answer) {
                System.out.println("Correct");
                counter++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + randomNumber + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                counter += Engine.ROUNDSFORLOSE;
            }
        }

        if (counter == Engine.ROUNDSFORWIN) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }

    }
}
