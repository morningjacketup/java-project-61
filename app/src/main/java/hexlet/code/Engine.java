package main.java.hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;

    public static final int START = 1;
    public static final int RANDOMNUMBER = 50;
    public static final int RANDOMSECONDNUMBER = 100;
    public static final int BEGINSTEP = 1;
    public static final int FINISHSTEP = 5;
    public static final int RANDOMINDEX = 10;
    public static final int RANDOMINDEXFORCALCULATOR = 2;
    public static final int ROUNDSFORWIN = 3;
    public static final int ROUNDSFORLOSE = 5;
    public static final int COUNTOFARRAYSIZE = 10;
    public static int counter;


    public static void greetingsText() {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calculator\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
    }

    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }

    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text;
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(Engine.START, Engine.RANDOMNUMBER);
    }

    public static int getRandomNumber2() {
        Random random = new Random();
        return random.nextInt(Engine.START, Engine.RANDOMSECONDNUMBER);
    }

    public static int getRandomIndex() {
        Random random = new Random();
        return random.nextInt(Engine.RANDOMINDEXFORCALCULATOR);
    }

    public static void congratulations() {
        if (Engine.counter == Engine.ROUNDSFORWIN) {
            System.out.println("Congratulations, " + hexlet.code.Cli.getName() + "!");
        }
    }
}
