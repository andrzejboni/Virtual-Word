package com.company.Animals;

import com.company.Animal;
import com.company.World;

public class Turtle extends Animal {
    public Turtle(World world, int width, int height, World world1, int width1, int height1) {
        super(world, width, height, world1, width1, height1);
        power = 2;
        initiative = 1;
        type = 'T';
    }
    public char draw() {
        return type;
    }
}
