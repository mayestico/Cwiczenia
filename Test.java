import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int smallNumbers[] = new int[100];
         int odwrocone =1;
        for (int i = 0; i < 100; i++) {
            smallNumbers[i] = i;
            System.out.println(smallNumbers[i]);
        }

        for (int i = 0; i <100; i++) {

            smallNumbers[i] =  smallNumbers[i]%2;
            System.out.println(smallNumbers[i]-1);
        }


//                Input:
//                1
//                2
//                88
//                42
//                99
//
//                Output:
//                1
//                2
//                88
    }
}