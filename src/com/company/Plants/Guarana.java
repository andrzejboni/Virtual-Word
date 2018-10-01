package com.company.Plants;

import com.company.Plant;
import com.company.World;

public class Guarana extends Plant {
    public Guarana(World world, int width, int height) {
        super(world, width, height);
        power = 0;
        initiative = 0;
        type = 'G';
    }

    public char draw() {
        return type;
    }

}
