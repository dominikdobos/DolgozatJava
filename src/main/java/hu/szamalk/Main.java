package hu.szamalk;

import hu.szamalk.modell.Tabla;

public class Main {
    public static void main(String[] args) {
        feladat4();
        feladat6es9();
    }

    public static void feladat4() {
        Tabla t = new Tabla('#');
        System.out.println("4. feladat: Az üres tábla:\n" + t.megjelenit());
    }

    public static void feladat6es9() {
        Tabla t = new Tabla('#');
        t.elhelyez(5);
        System.out.println("6. feladat: A feltöltött tábla:\n" + t.megjelenit());

        System.out.println("\n9. feladat: Üres oszlopok és sorok száma:\n" +
                            "Oszlopok: "+ t.uresOszlopokSzama() + "\n"+
                            "Sorok: "+ t.uresSorokSzama());
    }
}