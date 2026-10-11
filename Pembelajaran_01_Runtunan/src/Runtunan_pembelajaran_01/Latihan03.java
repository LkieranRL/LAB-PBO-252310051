package Runtunan_pembelajaran_01;

import java.util.Scanner;

public class Latihan03 {

    static final double PHI = 3.14;

    static double luasKerucut(double r, double s) {
        double luas = PHI * r * (r + s);
        return luas;
    }

    static double volumeKerucut(double r, double t) {
        double volume = (PHI * r * r * t) / 3;
        return volume;
    }

    static double luasTabung(double r, double t) {
        double luas = 2 * PHI * r * (r + t);
        return luas;
    }

    static double volumeTabung(double r, double t) {
        double volume = PHI * r * r * t;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jariJari;
        double tinggi;
        double garisPelukis;

        System.out.println("===PENGHITUNG LUAS DAN VOLUME===");
        System.out.println("1. Kerucut");
        System.out.println("2. Tabung");
        System.out.print("Pilih bangun ruang (1/2): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan jari-jari: ");
        jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextDouble();

        if (pilihan == 1) {
            System.out.print("Masukkan garis pelukis kerucut: ");
            garisPelukis = input.nextDouble();

            System.out.println("\n===HASIL KERUCUT===");
            System.out.println("Luas permukaan: "
                    + luasKerucut(jariJari, garisPelukis));
            System.out.println("Volume: "
                    + volumeKerucut(jariJari, tinggi));

        } else if (pilihan == 2) {
            System.out.println("\n===HASIL TABUNG===");
            System.out.println("Luas permukaan: "
                    + luasTabung(jariJari, tinggi));
            System.out.println("Volume: "
                    + volumeTabung(jariJari, tinggi));

        } else {
            System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}