package com.company.Animals;

import com.company.Animal;
import com.company.World;

public class Sheep extends Animal {

    public Sheep(World world, int width, int height) {
        super(world, width, height);
        power = 4;
        initiative = 4;
        type = 'S';
    }

    public char draw() {
        return type;
    }
}
