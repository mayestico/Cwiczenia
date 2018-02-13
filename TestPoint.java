/*import java.util.Scanner;

public class TestPoint {

    private static String menu = "Cześć co chcesz zrobić?\n " +
            "1 Wprowadz dane punktu 1\n" +
            "2 Wprowadź dane punktu 2\n" +
            "3 Przesuń punkt o jeden wektor\n" +
            "4 Przesuń punkt o 2 wektor\n" +
            "5 Oblicz odleglosc pomiedzy punktami\n" +
            "6 Wyswietl wszystkie dane\n" +
            "0 Zakoncz";

    public static void main(String[] args) {

        int choice;
        Scanner cin = new Scanner(System.in);
        Point p1, p2;
        p1 = new Point();
        p2 = new Point();
        int a, b;

        do {
            System.out.print(menu);
            choice = cin.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Wprowadz X ");
                    p1.setX(cin.nextInt());
                    System.out.println("Wprowadz y");
                    p1.setY(cin.nextInt());
                    break;
                case 2:
                    System.out.println("Wprowadz X");
                    p2.setX(cin.nextInt());
                    System.out.println("Wprowadz y");
                    p2.setY(cin.nextInt());
                    break;
                case 3:
                    System.out.println("Wprowadx X wektora: ");
                    a = cin.nextInt();
                    System.out.println("Wprowadz y wektora: ");
                    b = cin.nextInt();
                    p1.move(a, b);

                case 4:
                    System.out.println("Wprowadz X wektora");
                    a = cin.nextInt();
                    System.out.println("Wprowadz y wektora");
                    b = cin.nextInt();
                    p2.move(a, b);
                    break;
                case 5:
                    System.out.println("Odleglosc: " + p1.distance(p2));
                    break;
                case 6:
                    System.out.println("Punkt 1: " + p1 + "ćwiartka " + p1.quarter());
                    System.out.println("Punkt 2:" + p2 + "ćwiartka " + p2.quarter());
                case 0:
                    System.out.println("Do widzenia");
                break;
            }




        }while (choice > 0) ;


    }


}
*/
