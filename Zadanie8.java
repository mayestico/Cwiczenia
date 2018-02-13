import java.util.Random;

public class Zadanie8 {

    public static void main(String[] args) {
        Random losowe = new Random();
        int [] tablica = new int[101];
        int [] statystyka = new int[101];
        for (int i = 1; i <tablica.length; i++) {

            tablica [i] = losowe.nextInt(21);

        }

        for (int i = 0; i < tablica.length; ++i) {
            int cud = tablica[i];
            statystyka[cud] += 1;

        }
        for (int i = 1; i <tablica.length ; i++) {
            System.out.println("Numer "+i + " Liczby losowe "+statystyka[i]);
        }




        }
    }


