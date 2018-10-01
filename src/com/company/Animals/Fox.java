package com.company.Animals;

import com.company.Animal;
import com.company.World;

public class Fox extends Animal {
    public Fox(World world, int width, int height, World world1, int width1, int height1) {
        super(world, width, height, world1, width1, height1);
        power = 3;
        initiative = 7;

    }
}
