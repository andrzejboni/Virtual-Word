package com.company;

import com.company.Animals.Antelope;
import com.company.Animals.Fox;

public abstract class Animal extends Organism {


    public Animal(World world, int width, int height) {
        super(world, width, height);
        alive = true;

    }

    public void action() {

        width = Utils.randomNumber(width - 1, width + 1);
        height = Utils.randomNumber(height - 1, height + 1);
    }

    public void collision(Organism o) {
        if (o.getClass().equals(this.getClass())) {

        }
        else {
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

}
