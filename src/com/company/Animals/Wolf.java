package com.company.Animals;

import com.company.Animal;
import com.company.World;

public class Wolf extends Animal {

    public Wolf(World world, int width, int height) {
        super(world, width, height);
        power = 9;
        initiative = 5;
        type = 'W';
    }
    public char draw() {
        return type;
    }



}

