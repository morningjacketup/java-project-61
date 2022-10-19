package hexlet.code.games;

import hexlet.code.Cli;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ProgressionGame {

    public static void startGame() {
        int counter = 0;

        System.out.println("What number is missing in the progression?");

        while (counter < 3) {
            Scanner sc = new Scanner(System.in);

            List<Integer> list = new ArrayList<>();

            Random random = new Random();

            int step = random.nextInt(2, 5);
            int randomIndex = random.nextInt(10);
            int randomStart = random.nextInt(100);

            for (int i = 0; i < 10; i++) {
                list.add(randomStart);
                randomStart += step;
            }

            String listString = list.toString();

            System.out.print("Question: ");

            for (int i = 0; i < randomIndex; i++) {
                System.out.print(list.get(i) + " ");
            }

            System.out.print("..");

            for (int i = randomIndex + 1; i < list.size() - 1; i++) {
                System.out.print(" " + list.get(i));
            }

            System.out.println("\nYour answer: ");

            int answer = sc.nextInt();

            if (list.get(randomIndex) == answer) {
                System.out.println("Correct");
                counter++;
            } else {
                System.out.println("'" + answer + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'"
                        + list.get(randomIndex) + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                counter += 4;
            }
        }

        if (counter == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }

}
