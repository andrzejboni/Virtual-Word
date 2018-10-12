package com.company.Animals;

import com.company.Animal;
import com.company.Organism;
import com.company.Utils;
import com.company.World;

import static com.company.World.worldHeight;
import static com.company.World.worldWidth;

public class Antelope extends Animal {

    public Antelope(World world, int width, int height) {
        super(world, width, height);
        power = 4;
        initiative = 4;
        type = 'A';
    }

    public char draw() {
        return type;
    }



    public void action() {
        int temporaryWidth = Utils.randomNumber((width - 2), (width + 2));
        int temporaryHeight = Utils.randomNumber((height - 2), (height + 2));


        setWidth(temporaryWidth);
        setHeight(temporaryHeight);
    }




}
