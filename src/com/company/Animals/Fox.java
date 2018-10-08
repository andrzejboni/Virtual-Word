package com.company.Animals;

import com.company.Animal;
import com.company.Organism;
import com.company.Plants.Belladonna;
import com.company.Plants.Guarana;
import com.company.Utils;
import com.company.World;

import static com.company.Main.virtualWorld;

public class Fox extends Animal {
    public Fox(World world, int width, int height) {
        super(world, width, height);
        power = 3;
        initiative = 7;
        type = 'F';
    }

    public char draw() {
        return type;
    }


    public void collision(Organism o) { // Dobry węch -> do zrobienia
        if (o.getClass().equals(this.getClass())) {
            int[] wolnePole = new int[2];



            wolnePole = Utils.randomFreeNumber(o.getWidth() - 1, o.getWidth() + 1, o.getHeight() - 1, o.getHeight() + 1); // Search first free cell near object
            if (o.getClass().equals(Fox.class)) {
                Fox a = new Fox(virtualWorld, wolnePole[0], wolnePole[1]);
                virtualWorld.organismList.add(a);
            }

        } else {

            if (o.getClass().equals(Turtle.class) && this.getPower() < 5) { // Special feature for Turtle
                return;
            }


            if (o.getClass().equals(Antelope.class)) { // Special feature for Antelope
                int random = Utils.randomNumber(0, 1);

                if (random == 1) {
                    return;
                }
            }


            if (o.getClass().equals(Guarana.class)) { // Special feature for Guarana

                if (this.getPower() > o.getPower()) {

                    this.setWidth(o.getWidth());
                    this.setHeight(o.getHeight());

                    o.setAlive(false);
                } else {
                    o.setWidth(this.getWidth());
                    o.setHeight(this.getHeight());

                    this.setAlive(false);
                }

                this.setPower(this.getPower() + 3); // Zwiekszenie siły zwierzecia które zjadło guarana o 3

            }

            if (o.getClass().equals(Belladonna.class)) { // Special feature for Belladonna (Wilcze jagody)
                this.setAlive(false);   // :(
            }


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




