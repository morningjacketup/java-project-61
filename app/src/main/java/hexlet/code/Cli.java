package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String name;

    public static String getName() {
        return name;
    }

    static void greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        name = sc.nextLine();
        System.out.println("Hello, " + name);
    }

}
