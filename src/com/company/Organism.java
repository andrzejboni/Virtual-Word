package com.company;

import com.company.Animals.*;
import com.company.Plants.Belladonna;
import com.company.Plants.Dandelion;
import com.company.Plants.Grass;
import com.company.Plants.Guarana;

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

    public void collision(Organism organism) {

    }

    public char draw() {
        return type;
    }

    public Organism(World world, int width, int height) {
        this.world = world;
        this.width = width;
        this.height = height;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[][] getPosition() {
        return position;
    }

    public void setPosition(int[][] position) {
        this.position = position;
    }

    public boolean getIsAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
