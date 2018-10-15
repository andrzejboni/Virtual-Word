package com.company;

import com.company.Animals.*;
import com.company.Plants.Belladonna;
import com.company.Plants.Dandelion;
import com.company.Plants.Grass;
import com.company.Plants.Guarana;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.company.Main.virtualWorld;

public class World {

    public static int worldWidth = 30;
    public static int worldHeight = 30;
    public static int temporaryAge = 1;


    public static int minWidth = 1;
    public static int minHeight = 1;


    public static char[][] world = new char[worldWidth][worldHeight];
    public List<Organism> organismList = new ArrayList<Organism>();

    public static List<String> logs = new ArrayList<String>();


    public void fillEmptyWorld() {
        for (int i = 0; i < worldWidth; i++) {
            for (int j = 0; j < worldHeight; j++) {
                world[i][j] = '_';
            }
        }
    }


    public void drawTheWorld() {

        for (int i = 1; i < organismList.size(); i++) { // Put objects into world table   /// !!!!!!!!!! Zweryfikować oragnismList.size() -1 !

//
//            System.out.println("Szerokośc organizmu " + i + " to " + organismList.get(i).getWidth());
//            System.out.println("Wysokosc organizmu " + i + " to " + organismList.get(i).getHeight());

//            System.out.println("Klasa organizmu to " + i + " to " + organismList.get(i).getClass());
//            System.out.println("Czy zyje " + i + " to " + organismList.get(i).getIsAlive());
//            System.out.println("Wiek tego objektu to " + i + " to " + organismList.get(i).getAge());
            world[organismList.get(i).getWidth()][organismList.get(i).getHeight()] = organismList.get(i).getType();
        }


        for (int i = 0; i < worldWidth; i++) {
            System.out.print("\n");
            for (int j = 0; j < worldHeight; j++) {
                System.out.print(world[i][j]);
            }
        }
    }

    public void makeTurn() {

        for (int i = 0; i < organismList.size(); i++) {
            // Should i remove Obcejct from
            world[virtualWorld.organismList.get(i).getWidth()][virtualWorld.organismList.get(i).getHeight()] = '_';

            virtualWorld.organismList.get(i).action();
            virtualWorld.organismList.get(i).setAge(temporaryAge);
        }
        temporaryAge++;
    }


    public List<Organism> populateWorld() {
        int[] wolnePole;


        // Animals
        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight); // Search first free cell (!)
        Antelope a1 = new Antelope(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a1);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Antelope a2 = new Antelope(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a2);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Antelope a3 = new Antelope(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a3);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Fox a4 = new Fox(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a4);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Fox a5 = new Fox(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a5);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Fox a6 = new Fox(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a6);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Sheep a7 = new Sheep(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a7);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Sheep a8 = new Sheep(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a8);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Sheep a9 = new Sheep(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a9);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Turtle a10 = new Turtle(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a10);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Turtle a11 = new Turtle(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a11);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Turtle a12 = new Turtle(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a12);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Wolf a13 = new Wolf(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a13);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Wolf a14 = new Wolf(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a14);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Wolf a15 = new Wolf(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a15);


        // Plants
        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Belladonna p1 = new Belladonna(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p1);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Belladonna p2 = new Belladonna(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p2);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Belladonna p3 = new Belladonna(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p3);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Dandelion p4 = new Dandelion(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p4);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Dandelion p5 = new Dandelion(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p5);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Dandelion p6 = new Dandelion(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p6);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Grass p7 = new Grass(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p7);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Grass p8 = new Grass(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p8);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Grass p9 = new Grass(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p9);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Guarana p10 = new Guarana(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p10);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Guarana p11 = new Guarana(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p11);

        wolnePole = Utils.randomFreeNumber(minWidth, worldWidth, minHeight, worldHeight);
        Guarana p12 = new Guarana(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p12);

        return organismList;
    }


    public static int getWorldWidth() {
        return worldWidth;
    }



    public static int getWorldHeight() {
        return worldHeight;
    }


    public static char[][] getWorld() {
        return world;
    }

    public static void setWorld(char[][] world) {
        World.world = world;
    }

}
