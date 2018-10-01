package com.company;

public abstract class Organism {

    protected int power;
    protected int initiative;
    protected int age;
    protected int position[][];
    protected boolean alive;
    protected World world = new World();

    protected int width;
    protected int height;


    public void action() {
        System.out.println(" ");
    }

    public void collision() {
        System.out.println(" ");
    }

    public void draw() {
        System.out.println(" ");
    }

    public Organism(World world, int width, int height) {
        this.world = world;
        this.width = width;
        this.height = height;
    }
}
