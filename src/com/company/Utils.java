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
        tablica[0] = -1;
        tablica[1] = -1;

        int width = random.nextInt((maxWidth - minWidth) + 1) + minWidth;
        int height = random.nextInt((maxHeight - minHeight) + 1) + minHeight;

        if (World.world[width][height] == ' ') {
            tablica[0] = width;
            tablica[1] = height;
        } else {
            randomFreeNumber(minWidth, maxWidth, minHeight, maxHeight);
        }
        return tablica;
    }


    public static int checkForFreeSpace() {
        int licznik = 0;
        for (int i = 0; i < World.world.length ; i++) {
            for (int j = 0; j <World.world.length; j++) {
                if (World.world[i][j] != ' ') {
                    licznik++;
                }
            }
        }
//World.world[0][0] = 1;
        return licznik;
    }

    public static boolean isAlvie(Organism o) {
        if (o.getIsAlive()) {
            return true;
        }
        return false;
    }

}
