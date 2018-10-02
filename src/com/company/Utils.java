package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {


    public static int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }


    public static int[] randomFreeNumber(int minWidth, int maxWidth, int minHeight, int maxHeight) {
        Random random = new Random();
        int tablica[] = new int[2];

        int width = random.nextInt((maxWidth - minWidth) + 1) + minWidth;
        int height = random.nextInt((maxHeight - minHeight) + 1) + minHeight;

        if (World.world[width][height] == ' ') {
            tablica[0] = width;
            tablica[1] = height;
        }
        return tablica;
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
