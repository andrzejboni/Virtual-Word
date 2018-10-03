package com.company;

public class Main {

    public static World virtualWorld = new World();

    public static void main(String[] args) {


        virtualWorld.fillEmptyWorld();
        Utils.checkForFreeSpace();
        virtualWorld.populateWorld();

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
