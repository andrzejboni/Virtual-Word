package com.company;

import com.company.Animals.*;
import com.company.Plants.Belladonna;
import com.company.Plants.Dandelion;
import com.company.Plants.Grass;
import com.company.Plants.Guarana;

import java.lang.reflect.Constructor;
import java.security.Timestamp;
import java.time.Instant;

import static com.company.Main.virtualWorld;
import static com.company.World.worldHeight;
import static com.company.World.worldWidth;


public abstract class Organism {

    protected int power;
    protected int initiative;
    protected int age;
    protected int position[][];
    protected boolean alive;
    protected char type;
    protected World world = new World();


    protected int width; // szerokosc
    protected int height; // wysokosc


    public void action() {
    }

    public void collision(Organism o) {
        if (o.getClass().equals(this.getClass())) { // Jesli obeikty sa tego samego typu, ZACHODZI ROZMNAZANIE

            int[] wolnePole = new int[2];




            wolnePole = Utils.randomFreeNumber(o.getWidth() - 1, o.getWidth() + 1, o.getHeight() - 1, o.getHeight() + 1); // Search first free cell near object


//            Constructor constructor = o.getClass().getDeclaredConstructor(int.class, int.class, World.class);
//            constructor.newInstance();
//
//            org.getClass().newInstance(); // uzywa domyslnego konstruktora

//            ANIMALS (!) Multiplication
            if (o.getClass().equals(Antelope.class)) {
                Antelope a = new Antelope(virtualWorld, wolnePole[0], wolnePole[1]);
                virtualWorld.organismList.add(a);
            }
            if (o.getClass().equals(Fox.class)) {
                Fox a = new Fox(virtualWorld, wolnePole[0], wolnePole[1]);
                virtualWorld.organismList.add(a);
            }
            if (o.getClass().equals(Sheep.class)) {
                Sheep a = new Sheep(virtualWorld, wolnePole[0], wolnePole[1]);
                virtualWorld.organismList.add(a);
            }
            if (o.getClass().equals(Turtle.class)) {
                Turtle a = new Turtle(virtualWorld, wolnePole[0], wolnePole[1]);
                virtualWorld.organismList.add(a);
            }
            if (o.getClass().equals(Wolf.class)) {
                Wolf a = new Wolf(virtualWorld, wolnePole[0], wolnePole[1]);
                virtualWorld.organismList.add(a);
            }


            // PLANTS (!) Multiplication
            if (o.getClass().equals(Belladonna.class)) {
                Belladonna a = new Belladonna(virtualWorld, wolnePole[0], wolnePole[1]);
                virtualWorld.organismList.add(a);
            }
            if (o.getClass().equals(Dandelion.class)) {
                Dandelion a = new Dandelion(virtualWorld, wolnePole[0], wolnePole[1]);
                virtualWorld.organismList.add(a);
            }
            if (o.getClass().equals(Grass.class)) {
                Grass a = new Grass(virtualWorld, wolnePole[0], wolnePole[1]);
                virtualWorld.organismList.add(a);
            }
            if (o.getClass().equals(Guarana.class)) {
                Guarana a = new Guarana(virtualWorld, wolnePole[0], wolnePole[1]);
                virtualWorld.organismList.add(a);
            }


        } else {


            if (o.getClass().equals(Turtle.class) && this.getPower() < 5) { // Special feature for Turtle
                return;
            }


            if (o.getClass().equals(Antelope.class)) { // Special feature for Antelope
                int random = Utils.randomNumber(0, 1);

                if (random == 1) {
                    return;
                }
            }


            if (o.getClass().equals(Guarana.class)) { // Special feature for Guarana

                if (this.getPower() > o.getPower()) {

                    this.setWidth(o.getWidth());
                    this.setHeight(o.getHeight());

                    o.setAlive(false);
                } else {
                    o.setWidth(this.getWidth());
                    o.setHeight(this.getHeight());

                    this.setAlive(false);
                }

                this.setPower(this.getPower()+3); // Zwiekszenie siły zwierzecia które zjadło guarana o 3

            }

            if (o.getClass().equals(Belladonna.class)) { // Special feature for Belladonna (Wilcze jagody)
                this.setAlive(false);   // :(
            }


            if (this.getPower() > o.getPower()) {

                this.setWidth(o.getWidth());
                this.setHeight(o.getHeight());

                o.setAlive(false);
            } else {
                o.setWidth(this.getWidth());
                o.setHeight(this.getHeight());

                this.setAlive(false);
            }
        }

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
