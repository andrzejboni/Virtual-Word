package com.company;

import java.util.Random;

public class Utils {


    public static int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

}