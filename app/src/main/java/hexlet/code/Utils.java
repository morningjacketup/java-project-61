package main.java.hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateRandom(int scope) {
        Random random = new Random();
        return random.nextInt(0, scope);
    }
}
