package hexlet.code.games;

import hexlet.code.Cli;
import main.java.hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class CalculatorGame {

    public static void startGame() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        String[] operation = {"+", "-", "*"};

        int randomNumber1;
        int randomNumber2;
        System.out.println("What is the result of the expression?");

        while (counter < Engine.ROUNDS) {
            randomNumber1 = random.nextInt(Engine.RANDOMNUMBER);
            randomNumber2 = random.nextInt(Engine.RANDOMSECONDNUMBER);
            int randomIndex = random.nextInt(Engine.RANDOMINDEXFORCALCULATOR);

            int expression = 0;

            if (randomIndex == 0) {
                expression = randomNumber1 + randomNumber2;
            }
            if (randomIndex == 1) {
                expression = randomNumber1 - randomNumber2;
            }
            if (randomIndex == 2) {
                expression = randomNumber1 * randomNumber2;
            }

            System.out.println("Question: " + randomNumber1 + " " + operation[randomIndex] + " " + randomNumber2);
            int answer = sc.nextInt();

            if (answer == expression) {
                System.out.println("Correct");
                counter++;
            } else {
                System.out.println("'" + answer + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + expression + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                counter += 4;
            }
        }
        if (counter == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}
