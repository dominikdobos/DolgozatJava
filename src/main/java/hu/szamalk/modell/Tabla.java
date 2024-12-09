package hu.szamalk.modell;

public class Tabla {
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
}
