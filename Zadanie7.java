import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz limit");
        int limit = in.nextInt();
        int suma = 0;
        int ilosc = 0;
        for (int i = 0; i <limit; i++) {
            suma = suma + i;
        }
        System.out.println("Suma wszystkich liczb = " + suma +" Ilosc dodanych liczb " + limit );
    }

}
