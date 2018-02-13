import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int liczby[] = new int[in.nextInt()];

        for (int i = 0; i < liczby.length; i++) {

            liczby[i] = i;

            if ((liczby[i] % 3 == 0)) {
                System.out.println("Fizz");
            }
            if (liczby[i] % 5 == 0) {
                System.out.println("Buzz");
            }

        }
    }
}



