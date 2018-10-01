package com.company;

public abstract class Organism {

    int power;
    int initiative;
    int position[][];
    World world = new World();

    int width;
    int height;

    public void action(){
        System.out.println(" ");
    }

    public void collision(){
        System.out.println(" ");
    }
    public void draw(){
        System.out.println(" ");
    }

}
