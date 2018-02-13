
import java.util.Random;

public class Zadanie8a {

    public static final int ILOŚĆ_ELEMENTÓW_DO_ZBADANIA = 100;
    public static final int ZAKRES_WARTOŚCI = 21;

    // Napisz program
    public static void main(String args[]) {
        // który stworzy 100-elementową tablicę
        int[] liczby = new int[ILOŚĆ_ELEMENTÓW_DO_ZBADANIA];

        // i wypełni ją losowymi liczbami z przedziału 0-20
        Random random = new Random();
        for (int i = 0; i < liczby.length; ++i) {
            liczby[i] = random.nextInt(ZAKRES_WARTOŚCI); // 0-20, 21 liczb
//            liczby[i] = (int) Math.floor(Math.random() * ZAKRES_WARTOŚCI); -- alternatywnie
        }

        for (int l : liczby) {
            System.out.print(l + " ");
        }
        System.out.println();

        // a następnie policzy [wystąpienia poszczególnych liczb w tej tablicy]
        int[] statystyka = new int[ZAKRES_WARTOŚCI];
//        for (int l : liczby) {
//            statystyka[l] += 1;
//        }
        for (int i = 0; i < liczby.length; ++i) {
            int idx = liczby[i];
            statystyka[idx] += 1;
        }

        // i wyświetli wystąpienia poszczególnych liczb w tej tablicy
        for (int i = 0; i < statystyka.length; ++i) {
            System.out.println(i + ": " + statystyka[i]);
        }
    }
}