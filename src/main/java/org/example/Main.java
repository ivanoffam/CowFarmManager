package org.example;


public class Main {
    public static void main(String[] args) {
        DairyFarm dairyFarm = new DairyFarm();

        dairyFarm.giveBirth("1", "2", "Bella");

        dairyFarm.giveBirth("2", "3", "Daisy");
        dairyFarm.endLifeSpan("2");

        dairyFarm.printFarmData();
    }
}
