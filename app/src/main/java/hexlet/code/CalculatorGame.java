package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class CalculatorGame {

    public static void startCalculatorGame() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        String[] operation = {"+", "-", "*"};

        int randomNumber1 = 0;
        int randomNumber2 = 0;
        System.out.println("What is the result of the expression?");

        while (counter < 3) {
            randomNumber1 = random.nextInt(100);
            randomNumber2 = random.nextInt(100);
            int randomIndex = random.nextInt(2);

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

            System.out.println("Question: " + randomNumber1 + " " + operation[randomIndex] + " " + randomNumber2 );
            int answer = sc.nextInt();

            if (answer == expression) {
                System.out.println("Correct");
                counter++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + expression + "'");
                counter += 3;
            }

        }
        if (counter == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }


}
