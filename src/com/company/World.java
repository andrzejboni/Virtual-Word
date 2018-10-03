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
    public static int worldWidth = 20;
    public static int worldHeight = 20;

    public static int getWorldWidth() {
        return worldWidth;
    }

    public static void setWorldWidth(int worldWidth) {
        World.worldWidth = worldWidth;
    }

    public static int getWorldHeight() {
        return worldHeight;
    }

    public static void setWorldHeight(int worldHeight) {
        World.worldHeight = worldHeight;
    }

    public static char[][] getWorld() {
        return world;
    }

    public static void setWorld(char[][] world) {
        World.world = world;
    }
//    Organism organism = new Organism();

    public static char[][] world = new char[worldWidth][worldHeight];

//    String[][] edge = new String[worldWidth+2][worldHeight+2];

    public List<Organism> organismList = new ArrayList<Organism>(); // Lista organizmow !!! posrotować je po inicjatywie od najeiekszej do najmniejszej
    // posrotować po komaratorach


    public void fillEmptyWorld (){
        for (int i = 0; i < worldWidth; i++) {
            for (int j = 0; j < worldHeight; j++) {
                world[i][j] = ' ';
            }
        }
    }


    public void rysujSwiat() {
        for (int i = 0; i < worldWidth; i++) {
            for (int j = 0; j < worldHeight; j++) {
                System.out.println(world[i][j]);
            }
        }
    }

    public void makeTurn() {


    }


    public List<Organism> populateWorld() {
        int[] wolnePole;


        // Animals
        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight); // Search first free cell (!)
        Antelope a1 = new Antelope(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a1);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Antelope a2 = new Antelope(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a2);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Antelope a3 = new Antelope(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a3);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Fox a4 = new Fox(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a4);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Fox a5 = new Fox(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a5);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Fox a6 = new Fox(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a6);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Sheep a7 = new Sheep(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a7);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Sheep a8 = new Sheep(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a8);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Sheep a9 = new Sheep(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a9);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Turtle a10 = new Turtle(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a10);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Turtle a11 = new Turtle(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a11);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Turtle a12 = new Turtle(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a12);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Wolf a13 = new Wolf(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a13);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Wolf a14 = new Wolf(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a14);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Wolf a15 = new Wolf(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(a15);


        // Plants
        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Belladonna p1 = new Belladonna(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p1);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Belladonna p2 = new Belladonna(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p2);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Belladonna p3 = new Belladonna(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p3);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Dandelion p4 = new Dandelion(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p4);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Dandelion p5 = new Dandelion(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p5);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Dandelion p6 = new Dandelion(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p6);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Grass p7 = new Grass(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p7);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Grass p8 = new Grass(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p8);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Grass p9 = new Grass(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p9);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Guarana p10 = new Guarana(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p10);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Guarana p11 = new Guarana(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p11);

        wolnePole = Utils.randomFreeNumber(0, worldWidth, 0, worldHeight);
        Guarana p12 = new Guarana(virtualWorld, wolnePole[0], wolnePole[1]);
        organismList.add(p12);

        return organismList;
    }


}
