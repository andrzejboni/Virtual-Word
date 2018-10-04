package com.company;

import java.util.Scanner;

public class Main {

    public static World virtualWorld = new World();

    public static void main(String[] args) {


        virtualWorld.fillEmptyWorld();
        Utils.checkForFreeSpace();
        virtualWorld.populateWorld();
        Utils.bubbleSortComparator(virtualWorld.organismList);


        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Nacisnij t aby wywołać następną turę !");


        int j = 0;
        while (j < 20) {

            String zgadywanaLitera = scanner.nextLine();

            char litera = zgadywanaLitera.charAt(0);

            if (litera == 't') {
                virtualWorld.makeTurn();
                virtualWorld.drawTheWorld();
            }

            j++;
        }


//        int tab[] = Utils.randomFreeNumber(0, World.getWorldWidth(), 0, World.getWorldHeight());
//        System.out.println(" pierwsza " + tab[0] + " druga " + tab[1]);


//        System.out.println(virtualWorld.organismList);
//        Utils.bubbleSortComparator(virtualWorld.organismList);
//        System.out.println(virtualWorld.organismList);

//        int random = Utils.randomNumber(0, 1);
//
//        System.out.println(Utils.randomNumber(0,1));

    }
}
