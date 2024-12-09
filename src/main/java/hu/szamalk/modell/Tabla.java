package hu.szamalk.modell;

import java.util.Random;

public class Tabla {
    private static Random rnd = new Random();
    private char[][] T;
    private char uresCella;

    public Tabla(char karakter) {
        this.uresCella = karakter;
        this.T = new char[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.T[i][j] = uresCella;
            }
        }
    }

    public String megjelenit() {
        String s = "";

        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                s += T[i][j];
            }
            s += "\n";
        }

        return s;
    }

    public void elhelyez(int n) {
        int i = 0;

        while (i<n) {
            int velI = rnd.nextInt(0,8);
            int velJ = rnd.nextInt(0,8);
            if (this.T[velI][velJ] == this.uresCella) {
                this.T[velI][velJ] = 'K';
                i++;
            }
        }
    }

    public boolean uresOszlop(int oszlop) {
        int i = 0;
        while (i < T.length && !(this.T[i][oszlop] == 'K')) {
            i ++;
        }
        return i == T[0].length;
    }

    public boolean uresSor(int sor) {
        int i = 0;
        while (i < T.length && !(this.T[sor][i] == 'K')) {
            i ++;
        }
        return i == T[0].length;
    }

    public int uresOszlopokSzama() {
        int db = 0;
        for (int i = 0; i < T.length; i++) {
            if (uresOszlop(i)) {
                db++;
            }
        }
        return db;
    }

    public int uresSorokSzama() {
        int db = 0;
        for (int i = 0; i < T.length; i++) {
            if (uresSor(i)) {
                db++;
            }
        }
        return db;
    }
}
