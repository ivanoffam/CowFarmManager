package org.example;


import org.example.services.DairyFarm;

public class Main {
    public static void main(String[] args) {
        DairyFarm dairyFarm = new DairyFarm();

        dairyFarm.giveBirth(null, "1", "Bella");
        dairyFarm.giveBirth("1", "2", "Bellina");
        dairyFarm.giveBirth("1", "3", "Daisy");
        dairyFarm.giveBirth("2", "5", "Billa");
        dairyFarm.giveBirth("5", "6", "Billa1");
        dairyFarm.giveBirth("5", "7", "Billa2");
        dairyFarm.endLifeSpan("2");
        dairyFarm.printFarmData();
    }
}
