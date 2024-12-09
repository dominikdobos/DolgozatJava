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

    
}
