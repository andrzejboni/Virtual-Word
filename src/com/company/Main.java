package com.company;

public class Main {

    public static World virtualWorld = new World();

    public static void main(String[] args) {


        virtualWorld.fillEmptyWorld();
        Utils.checkForFreeSpace();
        virtualWorld.populateWorld();


        int tab[] = Utils.randomFreeNumber(0, World.getWorldWidth(), 0, World.getWorldHeight());
        System.out.println(" pierwsza " + tab[0] + " druga " + tab[1]);


        OrganismComparator organismComparator = new OrganismComparator();


        organismComparator.compare(virtualWorld.organismList.get(0),virtualWorld.organismList.get(3)); // Powinno zwrócić 1 -> antylopa jest mocniejsza
        System.out.println(organismComparator.compare(virtualWorld.organismList.get(0),virtualWorld.organismList.get(3)));
    }
}
