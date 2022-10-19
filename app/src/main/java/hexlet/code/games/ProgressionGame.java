package hexlet.code.games;

import hexlet.code.Cli;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ProgressionGame {

    public static void startGame() {
        int counter = 0;

        while (counter < 3) {
            Scanner sc = new Scanner(System.in);

            List<Object> list = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            Random random = new Random();

            int step = random.nextInt(2, 5);
            int randomIndex = random.nextInt(10);
            int randomStart = random.nextInt(100);

            for (int i = 0; i < 10; i++) {
                list.add(randomStart);
                list2.add(randomStart);
                randomStart += step;
            }

            list.set(randomIndex, "..");

            System.out.println(list);

            int answer = sc.nextInt();

            list.set(randomIndex, "..");

            if (list2.get(randomIndex) == answer) {
                System.out.println("Correct");
                counter++;
            } else {
                System.out.println("'" + answer + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'"
                        + list2.get(randomIndex) + "'");
                System.out.println("Let's try again, " + Cli.getName() +"!");
                counter += 4;
            }
        }

        if (counter == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }

}
