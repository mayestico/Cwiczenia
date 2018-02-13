import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int liczby[] = new int[in.nextInt()];


//        for (int i = 0; i <liczby.length; i++) {
//            liczby[i] = i;
//            System.out.println("Liczby" + i);
//        }

        for (int i = 0; i < liczby.length; i++) {

            liczby[i] = i;
//            System.out.println("Liczby" + i);
            if ((liczby[i] % 2 == 0)) {

            } else {
                System.out.println("Liczba " + liczby[i] + "jest nieparzysta");
            }
        }


    }
}
