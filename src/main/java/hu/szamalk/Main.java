package hu.szamalk;

import hu.szamalk.modell.Tabla;

public class Main {
    public static void main(String[] args) {
        feladat4();
    }

    public static void feladat4() {
        Tabla t = new Tabla('#');
        System.out.println("4. feladat: Az üres tábla:\n" + t.megjelenit());
    }
}