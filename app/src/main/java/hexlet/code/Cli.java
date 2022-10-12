package hexlet.code;

import java.util.Scanner;

public class Cli {
    static void greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        while (sc.hasNext()) {
            String name = sc.next();
            System.out.println("Hello, " + name);
            sc.close();
        }
    }

}
