package testing;

import javax.swing.JOptionPane;

public class NilaiTertinggi {
    public static void main(String[] args) {
        int[] angka = new int[5];

        for (int i = 0; i < angka.length; i++) {
            angka[i] = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Masukkan angka ke-" + (i + 1)
                )
            );
        }

        int terbesar = angka[0];
        int terkecil = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }

            if (angka[i] < terkecil) {
                terkecil = angka[i];
            }
        }

        JOptionPane.showMessageDialog(
            null,
            "Angka terbesar: " + terbesar
            + "\nAngka terkecil: " + terkecil
        );
    }
}