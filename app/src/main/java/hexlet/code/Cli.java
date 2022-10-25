package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greet() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
