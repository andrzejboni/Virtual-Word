package com.company.Animals;

import com.company.Animal;
import com.company.Organism;
import com.company.Plants.Belladonna;
import com.company.Plants.Dandelion;
import com.company.Plants.Grass;
import com.company.Plants.Guarana;
import com.company.Utils;
import com.company.World;

import static com.company.Main.virtualWorld;

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
