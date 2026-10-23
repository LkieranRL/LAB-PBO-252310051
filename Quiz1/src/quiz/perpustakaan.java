package quiz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class perpustakaan {
    public static void main(String[] args) {

        ArrayList<String> buku = new ArrayList<String>();
        String menu;

        while (true) {
            menu = JOptionPane.showInputDialog(
                "PERPUSTAKAAN\n\n"
                + "1. Masukkan Judul Buku\n"
                + "2. Hapus Judul Buku\n"
                + "3. Tampilkan Daftar Buku\n"
                + "4. Keluar\n\n"
                + "Pilih menu:"
            );

            if (menu == null) {
                break;
            }

            switch (menu) {
                case "1":
                    String judul = JOptionPane.showInputDialog("Masukkan judul buku: ");

                if (judul != null && !judul.trim().isEmpty()) {
                        buku.add(judul.trim());
                        JOptionPane.showMessageDialog(null, "Judul buku telah ditambahkan");
                    }
                    break;

                case "2":
                    if (buku.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Daftar buku masih kosong!");
                    } else {
                        String daftar = "";

                        for (int i = 0; i < buku.size(); i++) {
                            daftar += (i + 1) + ". "
                                    + buku.get(i) + "\n";
                        }

                        String hapus = JOptionPane.showInputDialog("DAFTAR BUKU\n\n" + daftar + "\nMasukkan nomor buku yang dihapus: ");

                        if (hapus != null) {
                            try {
                                int nomor = Integer.parseInt(hapus);

                                if (nomor >= 1 && nomor <= buku.size()) {
                                    buku.remove(nomor - 1);
                                    JOptionPane.showMessageDialog(null, "Buku telah dihapus");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Nomor buku tidak tersedia");
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Masukkan nomor yang sesuai");
                            }
                        }
                    }
                    break;

                case "3":
                    if (buku.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Belum ada buku yang tersimpan.");
                    } else {
                        String daftar = "";

                        for (int i = 0; i < buku.size(); i++) {
                            daftar += (i + 1) + ". "
                                    + buku.get(i) + "\n";
                        }

                        JOptionPane.showMessageDialog(null, "DAFTAR BUKU\n\n" + daftar);
                    }
                    break;

                case "4":
                    int pilihan = JOptionPane.showConfirmDialog(null,
                        "yakin ingin keluar?",
                        "Konfirmasi Keluar",
                        JOptionPane.YES_NO_OPTION
                    );

                    if (pilihan == JOptionPane.YES_OPTION) {
                        return;
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Pilihan tidak sesuai");
            }
        }
    }
}