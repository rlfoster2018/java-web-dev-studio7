package org.launchcode.studio7;

import java.util.ArrayList;

public class LP implements Disc{

    public String name;
    public Integer capacity;
    public ArrayList storage;
    public Boolean dataOnly = false;

    public LP (String name, Integer capacity, Boolean dataOnly) {
        this.name = name;
        this.capacity = capacity;
        this.dataOnly = dataOnly;
        this.storage = new ArrayList(capacity);
    }

    public void spinDisc() {
        Integer minSpin = 20;
        Integer maxSpin = 60;
        System.out.println("An LP spins at a rate of " + minSpin + "-" + maxSpin + " rpm.");
        System.out.println("");
    }

    public void report() {

        System.out.println("LP name: " + this.name);

        if (capacity.equals(0)) { System.out.println("LP is empty."); System.out.println("");}

        else {
            if (dataOnly == true) {
                System.out.println("Maximum Capacity (in B): " + this.capacity);
                System.out.println("Items In Storage: " + this.storage.size());
                System.out.println("This LP is coded for Fortran... like a boss.");
                System.out.println("");
            }
            else {
                System.out.println("Maximum Capacity (in songs): " + this.capacity);
                System.out.println("Songs In Storage: " + this.storage.size());
                System.out.println("");
            }
        }
    }

    public void readData(Integer memSpot) {
        System.out.println(this.storage.get(memSpot));
    }

    public void writeData (Object data) {
        this.storage.add(data);
    }

    public void writeSong (String title) {
        this.storage.add(title);
    }

    public void storageStatus() {
        for (Object item : storage) { System.out.println(item); }
    }

}
