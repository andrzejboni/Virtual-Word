package com.company;

import com.company.Animals.*;
import com.company.Plants.Belladonna;
import com.company.Plants.Dandelion;
import com.company.Plants.Grass;
import com.company.Plants.Guarana;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {
    public static int worldWidth = 30;
    public static int worldHeight= 30;

    World virtualWorld = new World();

//    Organism organism = new Organism();

    public static char[][] world = new char[worldWidth][worldHeight];

//    String[][] edge = new String[worldWidth+2][worldHeight+2];

    List<Organism> organismList = new ArrayList<Organism>(); // Lista organizmow !!! posrotować je po inicjatywie od najeiekszej do najmniejszej
    // posrotować po komaratorach


    public void rysujSwiat() {
        for (int i = 0; i < worldWidth; i++) {
            for (int j = 0; j < worldHeight; j++) {
                System.out.println(world[i][j]);
            }
        }
    }

    public void makeTurn(){


    }


    public void populateWorld(){
        // Animals

        Antelope a1 = new Antelope();
        Antelope a2 = new Antelope();
        Antelope a3 = new Antelope();

        Fox a4 = new Fox();
        Fox a5 = new Fox();
        Fox a6 = new Fox();

        Sheep a7 = new Sheep();
        Sheep a8 = new Sheep();
        Sheep a9 = new Sheep();

        Turtle a10 = new Turtle();
        Turtle a11 = new Turtle();
        Turtle a12 = new Turtle();

        Wolf a13 = new Wolf();
        Wolf a14 = new Wolf();
        Wolf a15 = new Wolf();




        int[] wolnePole = Utils.randomFreeNumber(0,20,0,20);
        // Plants
        Belladonna p1 = new Belladonna();
        Belladonna p2 = new Belladonna();
        Belladonna p3 = new Belladonna();

        Dandelion p4 = new Dandelion();
        Dandelion p5 = new Dandelion();
        Dandelion p6 = new Dandelion();

        Grass p7 = new Grass();
        Grass p8 = new Grass();
        Grass p9 = new Grass();

        Guarana p10 = new Guarana();
        Guarana p11 = new Guarana();
        Guarana p11 = new Guarana();
    }



}
