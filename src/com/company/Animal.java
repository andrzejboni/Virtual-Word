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

        if (World.world[temporaryWidth][temporaryHeight] != '_') {
            for (int i = 0; i < world.organismList.size(); i++) { // co jestli na jednym polu bedzie znajdowało sie 10 roznch objettków
                if (world.organismList.get(i).getWidth() == temporaryWidth && world.organismList.get(i).getHeight() == temporaryHeight) {
                    this.collision(world.organismList.get(i));
                }
            }
//            this.collision();
        }


        setWidth(temporaryWidth);
        setHeight(temporaryHeight);

    }

}
