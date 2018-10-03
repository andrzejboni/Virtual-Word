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

}
