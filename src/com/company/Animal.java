package com.company;

public abstract class Animal extends Organism {



    public Animal(World world, int width, int height, World world1, int width1, int height1) {
        super(world, width, height);
        this.world = world1;
        this.width = width1;
        this.height = height1;
        alive = true;

    }

    public void action() {
        System.out.println(" ");
    }

    public void collision() {
        System.out.println(" ");
    }

    public void draw() {
        System.out.println(" ");
    }
}
