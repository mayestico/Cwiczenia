import java.util.Scanner;

public class Point {


    private int x, y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int pX, int pY) {
        x = pX;
        y = pY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return " " + x + " " + y;

    }

    public int odlegloscMiedzyPunktami() {
        int wynik = x + y;
        return wynik;
    }
}

class PointTester {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Point ukladWspolrzednych = new Point();
        System.out.println("Wprowadz Wartosc dla punktu X");
        ukladWspolrzednych.setX(in.nextInt());
        System.out.println("Wprowadz wartosc dla punktu Y");
        ukladWspolrzednych.setY(in.nextInt());

        System.out.println(ukladWspolrzednych.odlegloscMiedzyPunktami());



    }
}
