package testing;

import javax.swing.JOptionPane;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        int[] nilai = new int[5];
        int total = 0;
        double rataRata;
        String hasil = "DAFTAR NILAI MAHASISWA\n\n";

        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Masukkan nilai mahasiswa ke-" + (i + 1)
                )
            );

            total += nilai[i];
        }

        rataRata = (double) total / nilai.length;

        for (int i = 0; i < nilai.length; i++) {
            hasil += "Mahasiswa " + (i + 1)
                    + ": " + nilai[i] + "\n";
        }

        hasil += "\nRata-rata: " + rataRata;

        if (rataRata >= 75) {
            hasil += "\nStatus: Lulus";
        } else {
            hasil += "\nStatus: Tidak Lulus";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}