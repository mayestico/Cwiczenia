import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {

        Scanner ilosc = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb");

        int iloscLiczb = ilosc.nextInt(); // tworzymy ilosc elementow w tablicy
        int number[] = new int[iloscLiczb];
        int sumowanie = 0;

        for (int i = 0; i < iloscLiczb; i++) {
            System.out.println("Podaj liczbe");
            number[i] = ilosc.nextInt();
            sumowanie += number[i];
        }
//        for (int i = 0; i < iloscLiczb; i++) {
//            sumowanie += number[i];
//        }
        System.out.println("Suma liczb "+sumowanie+" Srednia arytmetyczna " + + (double) sumowanie / iloscLiczb);


    }
}



