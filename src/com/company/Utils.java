package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.company.Main.virtualWorld;
import static com.company.World.worldHeight;
import static com.company.World.worldWidth;


public class Utils {

    public static int randomNumber(int min, int max) {


            Random random = new Random();
            int temp = random.nextInt((max - min) + 1) + min;

            if (temp > worldHeight-1 || temp < 0) {
                return randomNumber(min, max); // !!!!!!!!!!!!!!!!!!!!!!
            }
            return temp;
        }



    public static int licznikRekurencji = 0;

    public static int[] randomFreeNumber(int minWidth, int maxWidth, int minHeight, int maxHeight) {
        SecureRandom random = new SecureRandom();

        int tablica[] = new int[2];


        int width = random.nextInt(((maxWidth) - minWidth)) + minWidth;
        int height = random.nextInt((maxHeight - minHeight)) + minHeight;

        if (World.world[width][height] == '_' && width < worldWidth - 1 && height < worldHeight - 1 && width > 1 && height > 1) {
            tablica[0] = width;
            tablica[1] = height;

        } else {
            if (licznikRekurencji == 30) {
                licznikRekurencji = 0;
                System.out.println("Utils.randomFreeNumber doesn't find free cell");
                return null;
            }
            licznikRekurencji++;


            return randomFreeNumber(minWidth, maxWidth, minHeight, maxHeight);
        }
        licznikRekurencji = 0;
        return tablica;
    }

    public static int checkForFreeSpace() {
        int licznik = 0;
        for (int i = 0; i < World.getWorldWidth(); i++) {
            for (int j = 0; j < World.getWorldHeight(); j++) {
                if (World.world[i][j] == '_') {
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

    public List<Integer> bubbleSort(List<Integer> unsorted) {
        int a;
        int b;

        for (int j = 0; j < unsorted.size(); j++) {
            for (int i = 0; i < unsorted.size() - 1; i++) {
                if (unsorted.get(i) > unsorted.get(i + 1)) {
                    a = unsorted.get(i);
                    b = unsorted.get(i + 1);
                    unsorted.set(i, b);
                    unsorted.set(i + 1, a);
                }
            }
        }
        return unsorted;
    }


    public static List<Organism> bubbleSortComparator(List<Organism> list) {

        OrganismComparator organismComparator = new OrganismComparator(); // DEKLARACJA KLASY!
        Organism[] temp = new Organism[2];

        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (organismComparator.compare(list.get(i), list.get(i + 1)) == -1) {
                    // Jeśli powyższe wywołanie metody zwróci 1, większy jest get(i), jeśli -1 większy jest get(i+1), 0 to są równe
                    temp[0] = list.get(i);
                    temp[1] = list.get(i + 1);

                    list.set(i, temp[1]);
                    list.set(i + 1, temp[0]);
                }
            }
        }
        return list;
    }

}
//
//    public List<Integer> bubbleSort(List<Integer> unsorted) {
//        int a;
//        int b;
//
//        for (int j = 0; j < unsorted.size(); j++) {
//            for (int i = 0; i < unsorted.size() - 1; i++) {
//                if (unsorted.get(i) > unsorted.get(i + 1)) {
//                    a = unsorted.get(i);
//                    b = unsorted.get(i + 1);
//                    unsorted.set(i, b);
//                    unsorted.set(i + 1, a);
//                }
//            }
//        }
//        return unsorted;
//    }

