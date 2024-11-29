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
        int i = 0;
        for (String driver : f1drivers) {
        	System.out.println("Spot " + i);
        	i++;
            System.out.println(driver);
        }
        
        Random rand = new Random();
        int x = rand.nextInt(f1drivers.length);
        System.out.println("Driver selected: " + f1drivers[x]);
    }
}
