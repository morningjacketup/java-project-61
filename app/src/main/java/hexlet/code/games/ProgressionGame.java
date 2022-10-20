package hexlet.code.games;

import hexlet.code.Cli;
import main.java.hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;

public class ProgressionGame {

    public static void startGame() {
        System.out.println("What number is missing in the progression?");

        while (Engine.getCounter() < Engine.ROUNDS) {
            List<Integer> list = new ArrayList<>();
            int step = Engine.getRandomStep();
            int randomIndex = Engine.getRandomIndex();
            int randomStart = Engine.getRandomNumber();

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
                Engine.incrementCounter();
            } else {
                System.out.println("'" + answer + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'"
                        + list.get(randomIndex) + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                Engine.setCounter(Engine.ROUNDSFORLOSE);
            }
        }
        Engine.congratulations();
    }

}
