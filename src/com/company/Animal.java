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



        width  = Utils.randomNumber(width-1,width+1);
        height = Utils.randomNumber(height-1,height+1);
    }

    public void collision() {
        System.out.println(" ");
    }

    public char draw() {
        System.out.println(" ");
        return 0;
    }
}
