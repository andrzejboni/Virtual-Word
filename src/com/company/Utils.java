package com.company;

import java.util.Random;

public class Utils {


    public static int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }


    public static boolean checkFree(int width, int height) {
        if (World.world[width][height] != ' ') {
            return false;
        }
        return true;
    }

    public static boolean isAlvie(Organism o) {
        if (o.getIsAlive()) {
            return true;
        }
        return false;
    }

}
