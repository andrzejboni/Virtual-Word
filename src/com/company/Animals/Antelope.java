package com.company.Animals;

import com.company.Animal;
import com.company.Organism;
import com.company.Utils;
import com.company.World;

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
        width = Utils.randomNumber(width - 2, width + 2);
        height = Utils.randomNumber(height - 2, height + 2);
    }




}
