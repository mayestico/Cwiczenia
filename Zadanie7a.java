import java.util.Scanner;

public class Zadanie7a {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int limit = scan.nextInt();

            int ile = 0;
            int suma = 0;

            while (suma < limit) {
                suma += ile;
                ile += 1;
            }

            System.out.println("Suma: " + suma +
                    ", Limit: " + limit +
                    ", Ilosć: " + ile
            );
        }
    }
}