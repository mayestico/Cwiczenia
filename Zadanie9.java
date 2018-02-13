import java.util.Random;

public class Zadanie9 {
    public static void main(String[] args) {
        Random losowacz = new Random();

        long liczba = Math.abs(losowacz.nextLong());

        String tekst = Long.toString(liczba);

        int suma = 0;
        for (int i = 0; i < tekst.length(); ++i) {
            // sztuczka bazująca na kodach ASCII
            // i niejawnym rzutowaniu char na int (użycie odejmowania)
            int indeksZnakuWzględem0 = tekst.charAt(i) - '0';
            suma += indeksZnakuWzględem0;
        }

        System.out.println("Suma cyfr: " + suma + ", liczba: " + liczba);
    }}