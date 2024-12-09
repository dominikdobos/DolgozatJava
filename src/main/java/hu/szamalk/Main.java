package hu.szamalk;

import hu.szamalk.modell.Tabla;

public class Main {
    public static void main(String[] args) {
        feladat4();
        feladat6();
    }

    public static void feladat4() {
        Tabla t = new Tabla('#');
        System.out.println("4. feladat: Az üres tábla:\n" + t.megjelenit());
    }

    public static void feladat6() {
        Tabla t = new Tabla('#');
        t.elhelyez(10);
        System.out.println("6. feladat: A feltöltött tábla:\n" + t.megjelenit());
    }
}