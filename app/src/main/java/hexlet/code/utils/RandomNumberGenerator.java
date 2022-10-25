package main.java.hexlet.code.utils;

import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandom(int scope) {
        Random random = new Random();
        return random.nextInt(0, scope);
    }
}
