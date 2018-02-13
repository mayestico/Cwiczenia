import java.util.Scanner;

public class Zadanie5c {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb");
        int ilosc = in.nextInt();
        int iloczyn = 1;

        for (int i = 0; i < ilosc; i++) {
            System.out.println("Podaj liczbe");
            int liczba = in.nextInt();

            if (liczba != 0) {
                iloczyn = iloczyn * liczba;
            } else {
                System.out.println("Nie mnozymy przez 0!");
                i--;
            }
                System.out.println("Iloczyn" + iloczyn);
            }
        }
    }


