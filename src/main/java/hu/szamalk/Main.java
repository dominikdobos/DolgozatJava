package hu.szamalk;

import hu.szamalk.modell.Tabla;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Main {
    public static void main(String[] args) throws IOException {
        feladat4();
        feladat6es9();
        feladat10();
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

    public static void feladat10() throws IOException {
        File f = new File("tablak64.txt");
        if (f.exists()) {
            f.delete();
        }
        FileWriter fw = new FileWriter(f);
        try {
            for (int i = 1; i <= 64; i++) {
                Tabla t = new Tabla('*');
                t.elhelyez(i);
                fw.write(t.megjelenit() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        fw.close();
    }
}