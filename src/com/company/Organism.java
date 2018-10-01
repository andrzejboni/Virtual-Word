package com.company;

public abstract class Organism {

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

    public Organism(int power, int initiative, int age, int[][] position, World world, int width, int height) {
        this.power = power;
        this.initiative = initiative;
        this.age = age;
        this.position = position;
        this.world = world;
        this.width = width;
        this.height = height;
    }
}
