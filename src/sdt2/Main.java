package sdt2;

import java.util.Arrays;
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

        Arrays.sort(f1drivers);
        System.out.println("List of drivers");
        for (String driver : f1drivers) {
            System.out.println(driver);
        }
        
        Random rand = new Random();
        int[] grill = new int[f1drivers.length];
        
        for (int i = 0; i < grill.length; i++) {
            int randpos;
            do randpos = rand.nextInt(f1drivers.length) + 1; while (existpos(grill, randpos));
            grill[i] = randpos;
        }

        System.out.println("final grill:");
        for (int i = 0; i < f1drivers.length; i++)
            System.out.println("Spot " + grill[i] + ": " + f1drivers[i]);
    }

    public static boolean existpos(int[] grill, int pos) {
        for (int p : grill) if (p == pos) return true;
        return false;
    }
}
