package testing;

import javax.swing.JOptionPane;

public class DaftarBuku {
    public static void main(String[] args) {
        String[] buku = new String[5];
        String daftar = "DAFTAR BUKU PERPUSTAKAAN\n\n";

        for (int i = 0; i < buku.length; i++) {
            buku[i] = JOptionPane.showInputDialog(
                "Masukkan judul buku ke-" + (i + 1)
            );
        }

        for (int i = 0; i < buku.length; i++) {
            daftar += (i + 1) + ". " + buku[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, daftar);
    }
}
