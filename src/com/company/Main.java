package com.company;

public class Main {

    public static World virtualWorld = new World();

    public static void main(String[] args) {


        virtualWorld.fillEmptyTheWorld();
        System.out.println();


        Utils.checkForFreeSpace();

        System.out.println(Utils.checkForFreeSpace());


    }
}
