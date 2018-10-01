package com.company;

public class World {
    private int worldWidth;
    private int worldHeight;

//    Organism organism = new Organism();

    String[][] world = new String[worldWidth][worldHeight];


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
