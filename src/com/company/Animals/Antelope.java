package com.company.Animals;

import com.company.Animal;
import com.company.Organism;
import com.company.Utils;
import com.company.World;

import static com.company.World.worldHeight;
import static com.company.World.worldWidth;

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


//    public void action() {
//        int temporaryWidth = Utils.randomNumber(width - 2, width + 2);
//        int temporaryHeight = Utils.randomNumber(height - 2, height + 2);
//
//        if (temporaryWidth > worldWidth-1 || temporaryWidth < 1 || temporaryHeight > worldHeight-1 || temporaryHeight < 1) {
//
//            action();
//        }
//
//        setWidth(temporaryWidth);
//        setHeight(temporaryHeight);
//    }

    public void action() {
        int temporaryWidth = Utils.randomNumber((width - 2), (width + 2));
        int temporaryHeight = Utils.randomNumber((height - 2), (height + 2));

        if (temporaryWidth > worldWidth-2) {action();}
        if (temporaryWidth < 2) {action();}
        if (temporaryHeight > worldHeight-2) {action();}
        if (temporaryHeight < 2) {action();}

//
//        if (temporaryWidth > worldWidth-1 || temporaryWidth < 1 || temporaryHeight > worldHeight-1 || temporaryHeight < 1) {
//
//            action();
//        }

        setWidth(temporaryWidth);
        setHeight(temporaryHeight);
    }




}
