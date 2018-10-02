package com.company.Animals;

import com.company.Animal;
import com.company.World;

public class Turtle extends Animal {
    public Turtle(World world, int width, int height) {
        super(world, width, height);
        power = 2;
        initiative = 1;
        type = 'T';
    }
    public char draw() {
        return type;
    }
}
