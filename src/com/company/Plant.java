package com.company;

public abstract class Plant extends Organism {

    public Plant(World world, int width, int height) {
        super(world, width, height);
        alive = true;
    }


    public void action() {
    }

    public void collision() {
        System.out.println(" ");
    }

    public char draw() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getAge() {
        return age;
    }

    public int[][] getPosition() {
        return position;
    }

    public World getWorld() {
        return world;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
