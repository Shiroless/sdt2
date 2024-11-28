package sdt2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] f1drivers = {
            "Lewis Hamilton",
            "Max Verstappen",
            "Charles Leclerc",
            "Sergio Pérez",
            "Valtteri Bottas",
            "Lando Norris",
            "Daniel Ricciardo",
            "Fernando Alonso",
            "Sebastian Vettel",
            "Carlos Sainz"
        };

        Random rand = new Random();
        int i = rand.nextInt(f1drivers.length);
        System.out.println("Driver selected: " + f1drivers[i]);
    }
}
