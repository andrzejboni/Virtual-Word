package com.company;

import com.company.Animals.Antelope;
import com.company.Animals.Fox;

import static com.company.World.worldHeight;
import static com.company.World.worldWidth;

public abstract class Animal extends Organism {


    public Animal(World world, int width, int height) {
        super(world, width, height);
        alive = true;

    }

    public void action() {

        int temporaryWidth = Utils.randomNumber(width - 1, width + 1);
        int temporaryHeight = Utils.randomNumber(height - 1, height + 1);

        if (temporaryWidth > worldWidth-1 || temporaryWidth < 1 || temporaryHeight > worldHeight-1 || temporaryHeight < 1) {

            action();
        }

        setWidth(temporaryWidth);
        setHeight(temporaryHeight);

    }

}
