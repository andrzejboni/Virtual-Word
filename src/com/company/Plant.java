package com.company;

public abstract class Plant extends Organism {

    int power;
    int initiative;
    int age;
    int position[][];
    World world = new World();

    int width;
    int height;


    public void action() {
        System.out.println(" ");
    }

    public void collision() {
        System.out.println(" ");
    }

    public void draw() {
        System.out.println(" ");
    }

    public Plant(int power, int initiative, int age, int[][] position, World world, int width, int height) {
        this.power = power;
        this.initiative = initiative;
        this.age = age;
        this.position = position;
        this.world = world;
        this.width = width;
        this.height = height;
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
