package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GCDGame {

    public static void startGame() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        while (counter < 3) {
            int randomNumber = random.nextInt(1, 100);
            int randomNumber2 = random.nextInt(1, 100);

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
                counter += 4;
            }
        }

        if (counter == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }

    }
}
