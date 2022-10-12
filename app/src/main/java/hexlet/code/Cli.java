package hexlet.code;

import java.util.Scanner;

public class Cli {
    static void Greeting() {
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name);
    }

}
