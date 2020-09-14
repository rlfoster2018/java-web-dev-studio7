package org.launchcode.studio7;

import java.util.ArrayList;

public class CD implements Disc {

    public String name;
    public Integer capacity;
    public ArrayList storage;
    public Boolean dataCD = false;
    public String type = "CD";

    public void spinDisc() {
        Integer minSpin = 200;
        Integer maxSpin = 500;
        System.out.println("A CD spins at a rate of " + minSpin + "-" + maxSpin + " rpm.");
        System.out.println("");
    }

    public CD (String name, Integer capacity, Boolean enhanced) {
        this.name = name;
        this.capacity = capacity;
        this.storage = new ArrayList(capacity);
        this.dataCD = enhanced;
    }

    public void report() {
        System.out.println("CD name: " + this.name);
        if (this.capacity.equals(0)) {
            System.out.println("This disc is empty.");
            System.out.println("");
        }
        else {
            if (dataCD == true) {
                System.out.println("This CD is for data storage only.");
                System.out.println("Maximum Capacity (in MB): " + this.capacity);
                System.out.println("Items In Storage: " + this.storage.size());
                System.out.println("");
            }
            else {
                System.out.println("This CD is formatted for music only; no data.");
                System.out.println("Song Capacity: " + this.capacity);
                System.out.println("Songs on Disc: " + this.storage.size());
                System.out.println("");
        }}
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
