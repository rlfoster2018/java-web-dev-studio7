package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

    DVD disDVD = new DVD("Brothers Grimsby", 0, false);
//    disDVD.spinDisc();
//    disDVD.report();

    DVD dataDVD = new DVD("Number List", 3, true);
//    dataDVD.report();
//    dataDVD.writeData("1");
//    dataDVD.writeData("2");
//    dataDVD.writeData("3");
//    dataDVD.report();
//    dataDVD.readData(0);
//    dataDVD.storageStatus();
        // everything above here works, commented out for testing other elements

    CD musicCD = new CD("Led Zeppelin IV", 8, true);
//    musicCD.spinDisc();
//    System.out.println("");
//    musicCD.report();
//    musicCD.writeSong("Black Dog");
//    musicCD.writeSong("Rock and Roll");
//    musicCD.writeSong("The Battle of Evermore");
//    musicCD.writeSong("Stairway to Heaven");
//    musicCD.writeSong("Misty Mountain Hop");
//    musicCD.writeSong("Four Sticks");
//    musicCD.writeSong("Going To California");
//    musicCD.writeSong("When the Levee Breaks");
//    musicCD.storageStatus();
//    musicCD.report();
//    System.out.println("");
//    System.out.println("And the best song on the album is: ");
//    System.out.println("");
//    musicCD.readData(3);
//    System.out.println("");
//
    CD dataCD = new CD("Number List II; Number Harder", 3, true);
//    dataCD.report();
//    dataCD.writeData(4);
//    dataCD.writeData("5");
//    dataCD.report();
//    dataCD.readData(1);
//    dataCD.storageStatus();
//    System.out.println("");
//
    CD emptyCD = new CD("MGK's Greatest Hits", 0, false);
//    emptyCD.report();
//    System.out.println("");
        // everything above this line works, commented out to test other elements

    LP emptyLP = new LP("Best of Cardi B You Can Play In Church", 0, false);
//    emptyLP.spinDisc();
//    System.out.println("");
//    emptyLP.report();
//    System.out.println("");

    LP musicLP = new LP("Dark Side of the Moon", 10, false);
//    musicLP.report();
//    System.out.println("");
//    musicLP.writeSong("Speak To Me");
//    musicLP.writeSong("Breathe");
//    musicLP.writeSong("On the Run");
//    musicLP.writeSong("Time");
//    musicLP.writeSong("The Great Gig In The Sky");
//    musicLP.writeSong("Money");
//    musicLP.writeSong("Us and Them");
//    musicLP.writeSong("Any Colour You Like");
//    musicLP.writeSong("Brain Damage");
//    musicLP.writeSong("Eclipse");
//    musicLP.report();
//    System.out.println("");
//    musicLP.storageStatus();
//    System.out.println("");
//    musicLP.readData(5);
//    System.out.println();

    LP dataLP = new LP("List Numbers With A Vengeance", 3, true);
//    dataLP.report();
//    dataLP.writeData(6);
//    dataLP.writeData("7");
//    dataLP.writeData(8);
//    System.out.println("");
//    dataLP.report();
//    dataLP.readData(1);
//    dataLP.storageStatus();
//    System.out.println("");
        // everything above this line works, commented out to test other elements

    Floppy dataFloppy = new Floppy("Live Free Or List Numbers", 3);
//    dataFloppy.spinDisc();
//    System.out.println("");
//    dataFloppy.report();
//    dataFloppy.writeData(9);
//    dataFloppy.writeData("10");
//    dataFloppy.writeData(11);
//    System.out.println("");
//    dataFloppy.report();
//    dataFloppy.readData(0);
//    dataFloppy.storageStatus();
//    System.out.println("");
        // everything above this line works, commented out to test other elements

     Wheel kiddingMe = new Wheel();
//     kiddingMe.spinDisc();

    }
}
