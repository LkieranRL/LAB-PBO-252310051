package testing;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SistemPerpus {
    public static void main(String[] args) {

        ArrayList<String> buku = new ArrayList<String>();
        String menu;

        while (true) {
            menu = JOptionPane.showInputDialog(
                "SISTEM MENU MAKANAN\n\n"
                + "1. Tambah MENU\n"
                + "2. Hapus MENU\n"
                + "3. Tampilkan Daftar MENU\n"
                + "4. Keluar\n\n"
                + "Pilih menu:"
            );

            if (menu == null) {
                break;
            }

            switch (menu) {
                case "1":
                    String judul = JOptionPane.showInputDialog("Masukkan MENU baru: ");

                if (judul != null && !judul.trim().isEmpty()) {
                        buku.add(judul.trim());
                        JOptionPane.showMessageDialog(
                            null, "Menu berhasil ditambahkan!"
                        );
                    }
                    break;

                case "2":
                    if (buku.isEmpty()) {
                        JOptionPane.showMessageDialog(
                            null, "Daftar Menu masih kosong!"
                        );
                    } else {
                        String daftar = "";

                        for (int i = 0; i < buku.size(); i++) {
                            daftar += (i + 1) + ". "
                                    + buku.get(i) + "\n";
                        }

                        String hapus = JOptionPane.showInputDialog(
                            "DAFTAR Menu\n\n" + daftar
                            + "\nMasukkan nomor Menu yang dihapus:"
                        );

                        if (hapus != null) {
                            try {
                                int nomor = Integer.parseInt(hapus);

                                if (nomor >= 1 && nomor <= buku.size()) {
                                    buku.remove(nomor - 1);
                                    JOptionPane.showMessageDialog(
                                        null, "Menu berhasil dihapus!"
                                    );
                                } else {
                                    JOptionPane.showMessageDialog(
                                        null, "Nomor Menu tidak tersedia!"
                                    );
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(
                                    null, "Masukkan nomor yang benar!"
                                );
                            }
                        }
                    }
                    break;

                case "3":
                    if (buku.isEmpty()) {
                        JOptionPane.showMessageDialog(
                            null, "Belum ada Menu yang tersimpan."
                        );
                    } else {
                        String daftar = "";

                        for (int i = 0; i < buku.size(); i++) {
                            daftar += (i + 1) + ". "
                                    + buku.get(i) + "\n";
                        }

                        JOptionPane.showMessageDialog(
                            null, "SISTEM MENU MAKANAN\n\n" + daftar
                        );
                    }
                    break;

                case "4":
                    int pilihan = JOptionPane.showConfirmDialog(
                        null,
                        "Apakah Anda yakin ingin keluar?",
                        "Konfirmasi Keluar",
                        JOptionPane.YES_NO_OPTION
                    );

                    if (pilihan == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(
                            null, "Program MENU selesai."
                        );
                        return;
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(
                        null, "Pilihan tidak tersedia!"
                    );
            }
        }
    }
}