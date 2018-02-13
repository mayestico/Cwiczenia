import java.util.Scanner;

public class Zadanie6b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb");
        int[] ilosc = new int[in.nextInt()];
        int suma = 0;

        for (int i = 0; i <ilosc.length; i++) {
            System.out.println("Podaj liczbe");
            ilosc [i] = in.nextInt();
            suma += ilosc[i];
            }
        System.out.println("Suma Arytmetyczna " +(double) suma/ilosc.length);
    }
}
