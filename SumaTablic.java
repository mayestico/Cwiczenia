import java.util.Random;

public class SumaTablic {

    public static void main(String[] args) {

        Random gen = new Random();

        //deklaruje od razu trzy tablice:
        int[] tablica1, tablica2, suma_tablic;

        //rezerwuję miejsce w pamięci dla tablica1 oraz losuję elementy:
        tablica1 = new int[20];
        for (int i = 0; i < 20; i++) {
            tablica1[i] = gen.nextInt(21);
        }

        //rezerwuję miejsce w pamięci dla tablica2 oraz losuję elementy:
        tablica2 = new int[20];
        for (int i = 0; i < 20; i++) {
            tablica2[i] = gen.nextInt(21);
        }

        //rezerwuję miejsce w pamięci dla suma_tablic oraz
        //ustawiam wartości elementów w formie sum z tablica1 oraz tablica2:
        suma_tablic = new int[20];
        for (int i = 0; i < 20; i++) {
            suma_tablic[i] = tablica1[i] + tablica2[i];
        }

        //wypisuję wykonane działania:
        for (int i = 0; i < 20; i++) {
            System.out.println("" + tablica1[i] + " + " + tablica2[i] + " = " + suma_tablic[i]);
        }

    }

}
