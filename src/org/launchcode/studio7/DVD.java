package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD implements Disc {

    public String name;
    public Integer capacity;
    public ArrayList storage;
    public Boolean enhancedDVD = false;
    public String type = "DVD";

    public void spinDisc() {
        Integer minSpin = 570;
        Integer maxSpin = 1600;
        System.out.println("A DVD spins at a rate of " + minSpin + "-" + maxSpin + " rpm.");
        System.out.println("");
    }

    public DVD(String name, Integer capacity, Boolean enhanced) {
        this.name = name;
        this.capacity = capacity;
        this.enhancedDVD = enhanced;
        if (this.capacity > 0){ this.storage = new ArrayList(this.capacity);}
    }

    public void report() {
        System.out.println("DVD name: " + this.name);
        if (this.capacity.equals(0)) {
            System.out.println("This DVD is a movie; no data.");
            System.out.println("");
        }
        else {System.out.println("Maximum Capacity (in GB): " + this.capacity);
        System.out.println("Items In Storage: " + this.storage.size());
        if (enhancedDVD == true) {
            System.out.println("This DVD can be played in a CD player.");
            System.out.println("");
        }
        else {
            System.out.println("This DVD can NOT be successfully played in a CD player.");
            System.out.println("");
        }}
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