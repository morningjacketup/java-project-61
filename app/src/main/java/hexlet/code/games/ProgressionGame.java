package hexlet.code.games;

import hexlet.code.Cli;
import main.java.hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ProgressionGame {

    public static void startGame() {
        System.out.println("What number is missing in the progression?");

        while (Engine.counter < Engine.ROUNDS) {
            List<Integer> list = new ArrayList<>();

            Random random = new Random();

            int step = random.nextInt(Engine.BEGINSTEP, Engine.FINISHSTEP);
            int randomIndex = random.nextInt(Engine.RANDOMINDEX);
            int randomStart = random.nextInt(Engine.RANDOMNUMBER);

            for (int i = 0; i < Engine.COUNTOFARRAYSIZE; i++) {
                list.add(randomStart);
                randomStart += step;
            }

            System.out.print("Question: ");

            for (int i = 0; i < randomIndex; i++) {
                System.out.print(list.get(i) + " ");
            }

            System.out.print("..");

            for (int i = randomIndex + 1; i < list.size() - 1; i++) {
                System.out.print(" " + list.get(i));
            }

            System.out.println("\nYour answer: ");

            int answer = Engine.inputNumber();

            if (list.get(randomIndex) == answer) {
                System.out.println("Correct");
                Engine.counter++;
            } else {
                System.out.println("'" + answer + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'"
                        + list.get(randomIndex) + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                Engine.counter += Engine.ROUNDSFORLOSE;
            }
        }

        if (Engine.counter == Engine.ROUNDSFORWIN) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }

}
