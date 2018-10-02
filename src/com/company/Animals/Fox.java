package com.company.Animals;

import com.company.Animal;
import com.company.Organism;
import com.company.World;

public class Fox extends Animal {
    public Fox(World world, int width, int height, World world1, int width1, int height1) {
        super(world, width, height, world1, width1, height1);
        power = 3;
        initiative = 7;
        type = 'F';
    }
    public char draw() {
        return type;
    }


    public void collision(Organism o) { // Dobry węch ->
        if (o.getClass().equals(this.getClass())) {

        }
        else {
            if (this.getPower() > o.getPower()) {

                this.setWidth(o.getWidth());
                this.setHeight(o.getHeight());

                o.setAlive(false);
            } else {
                o.setWidth(this.getWidth());
                o.setHeight(this.getHeight());

                this.setAlive(false);
            }
        }

    }



}
