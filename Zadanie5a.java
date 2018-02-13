
import java.util.Scanner;

public class Zadanie5a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iloczyn = 1;

        System.out.println("Podaj ilość liczb");
        int iloscLiczb = in.nextInt();

        for (int i = 0; i < iloscLiczb; i++) {
            System.out.println("Podaj liczbę! ");
            int number = in.nextInt();

            if (number != 0) {
                iloczyn = iloczyn * number;
                System.out.println(iloczyn);
            } else {
                System.out.println("Nie mnożymy przez 0");
                i--;
            }
        }
        in.close();

        System.out.println(iloczyn);
    }
}


