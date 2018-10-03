package com.company;

import java.util.Comparator;

public class OrganismComparator implements Comparator<Organism> {
    @Override
    public int compare(Organism o1, Organism o2) { // Jeśli o1 wiekszy to 1, o2 wiekszy to -1
        if (o1.getInitiative() > o2.getInitiative()) {
            return 1;
        }
        if (o1.getInitiative() < o2.getInitiative()) {
            return -1;
        }
        if (o1.getInitiative() == o2.getInitiative()) {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            } else {
                return 1; // Jeśli wiek jest taki sami -> arbiratlnie niech pierwszy bedzie o1
            }
        }
        return 0;
    }
}
