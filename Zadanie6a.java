

import java.util.Scanner;

public class Zadanie6a {
    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Podaj wielkosc tablicy");
            int limit = scan.nextInt();

            if (limit < 1) {
                System.err.println("Nie wiem jak pobrać " + limit + " liczb!");
                return;
            }
            System.out.println("Podaj liczbe");
            int[] liczby = new int[limit];

            for (int i = 0; i < limit; ++i) {

                liczby[i] = scan.nextInt();

            }

            // ^^^ dotąd skopiowane z Zadanie5 ^^^

            double średnia = 0.0;
            for (int l : liczby) {
                średnia += l;
                System.out.println("Srednia" + średnia);
            }
            średnia /= liczby.length;

            System.out.println(średnia);
        }
    }
}
