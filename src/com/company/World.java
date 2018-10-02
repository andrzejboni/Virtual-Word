package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {
    public static int worldWidth = 20;
    public static int worldHeight= 20;

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




}
