package hu.szamalk.modell;


import java.util.*;

public class Feladat3 {
    private static Random rnd = new Random();
    private ArrayList<Character> nevem;
    private ArrayList<Character> angol;

    public Feladat3() {
        this.nevem = new ArrayList<>();
        this.angol = new ArrayList<>();
        nevMegad();
        angolMegad();
    }

    public void nevMegad() {
        nevem.add('D');
        nevem.add('o');
        nevem.add('b');
        nevem.add('o');
        nevem.add('s');
        nevem.add('D');
        nevem.add('o');
        nevem.add('m');
        nevem.add('i');
        nevem.add('n');
        nevem.add('i');
        nevem.add('k');
    }

    public void angolMegad() {
        // 91-96 rossz
        // 65 - 122
        for (int i = 0; i < 10; i++) {
            int j = rnd.nextInt(65,123);
            while (j != 91 && j != 92 && j != 93 && j != 94 && j != 95 && j != 96) {
                j = rnd.nextInt(65,123);
            }
            String betu = Character.toString(i);
            char ch = betu.charAt(1);

            angol.add(Character.valueOf(ch));
        }
    }

    public void megjelenit() {
        System.out.println("Kimenet az alábbi minta alapján:");
        String nev = "";
        for (int i = 0; i < nevem.size()-1; i++) {
            nev += nevem.get(i) + ",";
        }
        nev += nevem.getLast();

        String angolBetu = "";
        for (int i = 0; i < angol.size()-1; i++) {
            angolBetu += angol.get(i) + ",";
        }
        angolBetu += angol.getLast();

        System.out.println(nev);
        System.out.println(angolBetu);
    }

    public void stat() {
        TreeMap<Character, Integer> felh = new TreeMap<>();
        for (Character betu : nevem) {
            felh.put(betu, felh.getOrDefault(betu, 0) + 1);
        }
        for (Character betu : angol) {
            felh.put(betu, felh.getOrDefault(betu, 0) + 1);
        }


        System.out.println("Statisztika");
        System.out.println("\t-Felhasznált betűk: "+felh.keySet());
        System.out.println("\t-Betűk mennyisége: "+felh.entrySet());
    }
}
