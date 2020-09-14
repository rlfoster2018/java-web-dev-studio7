package org.launchcode.studio7;

import java.util.ArrayList;

public class Floppy implements Disc{

    public String name;
    public Integer capacity;
    public ArrayList storage;

    public void spinDisc() {
        Integer minSpin = 100;
        Integer maxSpin = 400;
        System.out.println("A Floppy Disc spins at a rate of " + minSpin + "-" + maxSpin + " rpm.");
        System.out.println("");
    }

    public Floppy (String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
        this.storage = new ArrayList(capacity);
    }

    public void report() {
        System.out.println("Disc name: " + this.name);
        System.out.println("Maximum Capacity (in KB): " + this.capacity);
        System.out.println("Items In Storage: " + this.storage.size());
        System.out.println("This format is exclusively used for data.");
    }

    public void readData(Integer memSpot) {
        System.out.println(this.storage.get(memSpot));
    }

    public void writeData (Object data) {
        this.storage.add(data);
    }

    public void storageStatus() {
        for (Object item : storage) { System.out.println(item); }
    }

}
