package com.company;

public abstract class Organism {

    protected int power;
    protected int initiative;
    protected int age;
    protected int position[][];
    protected boolean alive;
    protected char type;
    protected World world = new World();

    protected int width; // Wysokosc
    protected int height; // szerokosc


    public void action() {
    }

    public void collision() {
        System.out.println(" ");
    }

    public char draw() {
        return type;
    }

    public Organism(World world, int width, int height) {
        this.world = world;
        this.width = width;
        this.height = height;
    }
}
