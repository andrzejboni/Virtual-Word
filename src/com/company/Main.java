package com.company;

import com.company.Animals.Wolf;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static World virtualWorld = new World();

    public static void main(String[] args) {

        virtualWorld.fillEmptyWorld();
        Utils.checkForFreeSpace();
        virtualWorld.populateWorld();
        Utils.bubbleSortComparator(virtualWorld.organismList);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Nacisnij t aby wywołać następną turę !");
        System.out.println(virtualWorld.organismList.get(0).getType() + " Nowe bubu ");
        int j = 0;
        while (j <= 1500) {

//            String zgadywanaLitera = scanner.nextLine();
//            char litera = zgadywanaLitera.charAt(0);
//            if (litera == 't') {

            Utils.bubbleSortComparator(virtualWorld.organismList);
            virtualWorld.makeTurn();

            virtualWorld.drawTheWorld();
            System.out.println("\n\nIteracja " + j);
            System.out.println("Wolne miejsca : " + Utils.checkForFreeSpace());
            System.out.println("\n \n #######################################################################################################################################");
//            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
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
