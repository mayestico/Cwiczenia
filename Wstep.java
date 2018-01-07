

class Kursy {


    String tytul= "Kurs Excel";
    double cena = 42;
    boolean dostepnosc = true;

    void pokazTytul(String tytulKursu) {
        tytul = tytulKursu;
        System.out.println(tytul);
    }

    void pokazCene(double cenaKursu) {
        cena = cenaKursu;
        System.out.println(cena+"zł");
    }
}

public class Wstep {

    String nazwa = "Nowy Obiekt";

    public static void main(String[] args) {

        Kursy kurs1 = new Kursy();
        Kursy kurs2 = new Kursy();
        Kursy kurs3 = new Kursy();
        System.out.println(kurs1.tytul);
        kurs1.pokazTytul("Kurs Excel");
        kurs1.pokazCene(42);
        kurs2.pokazTytul("Kurs Word");
        kurs2.pokazCene(44);
        kurs3.pokazTytul("Kurs Acces");
        kurs3.pokazCene(49);



    }
}

