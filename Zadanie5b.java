import java.util.Scanner;

public class Zadanie5b {
    public static void main(String[] args) {

        Scanner ilosc = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb");
         int iloscLiczb = ilosc.nextInt();

        int iloczyn = 1;

        for (int i = 0; i < iloscLiczb; i++) {
            System.out.println("Podaj liczbe");
            int number = ilosc.nextInt();

            if (number != 0) {
                iloczyn = iloczyn * number;
                System.out.println(iloczyn);
            } else {
                System.out.println("Nie mnozymy przez 0!");
                i--;
            }
//            System.out.println("Iloczyn" + iloczyn);

        }
    }
}