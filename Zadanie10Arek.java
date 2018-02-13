import java.util.Scanner;

public class Zadanie10Arek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj nr PESEL");
        long pesel = in.nextLong();

        long[] cyfry = new long[11];

        int i = 0;

        // Rozdzielam pesel na pojedycze cyfry
        while (pesel != 0) {
            cyfry[i] = pesel % 10;
            System.out.println(" Modulo " +pesel + " wynik " + cyfry[i]);
            pesel = pesel / 10;
            System.out.println(cyfry[i]);
            System.out.println("Ilosc petli" + i);
            i++;
        }

        int[] wagi = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};

        // Odwracam tablice wagi (od brzegów do środka)
        for (int j = 0; j < wagi.length / 2; j++) {
            int odwr = wagi[j]; //
            wagi[j] = wagi[wagi.length - 1 - j];//OD 9 KONCA
            wagi[wagi.length - 1 - j] = odwr; //
        }

        // Sumuję iloczyny
        int suma = 0;
//        System.out.println("odwrocona tablica" +_1.length);
        for (int k = 0; k < wagi.length; k++) {
            int iloczyn = wagi[k] * (int) cyfry[k + 1];
            suma = suma + iloczyn;
        }

        System.out.println("Suma iloczynów wynosi: " + suma);


        // Obliczam resztę z dzielenia
        int wynik;
        if (suma % 10 > 0) {
            wynik = 10 - (suma % 10);
        } else {
            wynik = suma % 10;
        }
        System.out.println("Wynik to: " + wynik);

        // porównuję resztę z dzielenia z 11 cyfru PESEL
        if (wynik == cyfry[0]) {
            System.out.println("PESEL jest poprawny");
        } else {
            System.err.println("PESEL jest niepoprawny");
        }

    }
}