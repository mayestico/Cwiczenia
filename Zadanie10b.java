import java.util.Scanner;

// Basia
public class Zadanie10b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj PESEL");
        long pesel = scanner.nextLong();
        int[] tablica = new int[11];
        for (int i = 10; i >= 0; i--) {
            tablica[i] = (int) (pesel % 10);
            System.out.println("Exxon " + tablica[i]);
            pesel = pesel / 10;
            System.out.println("Exxon2" + tablica[i]);
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(tablica[i]);
        }

        int suma = 1 * tablica[0] + 3 * tablica[1] +
                7 * tablica[2] + 9 * tablica[3] +
                1 * tablica[4] + 3 * tablica[5] +
                7 * tablica[6] + 9 * tablica[7] +
                1 * tablica[8] + 3 * tablica[9];
        System.out.println("Suma wynosi: " + suma);

        int wynik;
        if (suma % 10 > 0) {
            wynik = 10 - suma % 10;
        } else {
            wynik = suma % 10;
        }
        System.out.println("Wynik to " + wynik);

        if (wynik == tablica[10]) {
            System.out.println("Numer PESEL jest poprawny");
        } else {
            System.out.println("Numer PESEL nie jest poprawny");
        }
    }
}