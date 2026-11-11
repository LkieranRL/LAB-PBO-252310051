package com.ibik.pbo.Pembelajaran.PBO_252310051_MAVEN;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class AppLogistik {

    static ArrayList<ArrayList<String>> pesanan = new ArrayList<>();

    static boolean jalan = true;

    public static void main(String[] args) {

    while (jalan) {

        String menu = JOptionPane.showInputDialog(
            "PT. XYZ LOGISTIK\n\n" +
            "1. Input Pesanan\n" +
            "2. Tracking Pesanan\n" +
            "3. Keluar\n\n" +
            "Pilih Menu:"
        );

        if (menu == null) {
            konfirmasiKeluar();
            continue;
        }

        try {

            int pilihan = Integer.parseInt(menu);

            switch (pilihan) {

                case 1:
                    inputPesanan();
                    break;

                case 2:
                    trackingPesanan();
                    break;

                case 3:
                    konfirmasiKeluar();
                    break;

                default:
                    JOptionPane.showMessageDialog(
                        null,
                        "Menu tidak tersedia!"
                    );
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                null,
                "Masukan angka",
                "Error Info",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    JOptionPane.showMessageDialog(null, "Terima kasih.");
}


    public static double inputAngka(String pesan) {

        while (true) {

            String input = JOptionPane.showInputDialog(pesan);

            if (input == null) {
                konfirmasiKeluar();
                return -1;
            }

            try {

                double angka = Double.parseDouble(input);

                if (angka <= 0) {
                    JOptionPane.showMessageDialog(
                        null, "Masukan angka yang lebih dari 0"
                    );
                    continue;
                }

                return angka;

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                    null, "Masukan angka",
                    "Error Info",
                    JOptionPane.ERROR_MESSAGE
                );
            }

            if (!jalan) return -1;
        }
    }

    public static void konfirmasiKeluar() {

        int pilihan = JOptionPane.showConfirmDialog(
            null,
            "Apakah anda ingin keluar ?",
            "Konfirmasi",
            JOptionPane.YES_NO_OPTION
        );

        if (pilihan == JOptionPane.YES_OPTION) {
            jalan = false;
        }
    }

    public static void inputPesanan() {

        String nama = JOptionPane.showInputDialog(
            "Masukkan Nama Pelanggan:"
        );

        if (nama == null) {
            konfirmasiKeluar();
            return;
        }

        String tujuan = JOptionPane.showInputDialog(
            "Masukkan Tujuan Pengiriman:"
        );

        if (tujuan == null) {
            konfirmasiKeluar();
            return;
        }

        double berat = inputAngka(
            "Masukkan Berat Barang (gram):"
        );

        if (berat <= 0) return;

        double jarak = inputAngka(
            "Masukkan Jarak Pengiriman (km):"
        );

        if (jarak <= 0) return;

        double biayaBerat = Math.ceil(berat / 100) * 5000;
        double biayaJarak = Math.ceil(jarak / 10) * 8000;

        double total = biayaBerat + biayaJarak;

        String resi = "XYZ" +
            (100000 + new Random().nextInt(900000));

        ArrayList<String> data = new ArrayList<>();

        data.add(resi);
        data.add(nama);
        data.add(tujuan);
        data.add(String.valueOf(berat));
        data.add(String.valueOf(jarak));
        data.add(String.valueOf(total));
        data.add("Pesanan diterima");

        pesanan.add(data);

        JOptionPane.showMessageDialog(
            null,
            "PESANAN BERHASIL DIBUAT!\n\n" +
            "Nomor Resi : " + resi + "\n" +
            "Nama       : " + nama + "\n" +
            "Tujuan     : " + tujuan + "\n" +
            "Berat      : " + berat + " gram\n" +
            "Jarak      : " + jarak + " km\n" +
            "Total Biaya: Rp" + String.format("%,.0f", total)
        );
    }

    public static void trackingPesanan() {

        if (pesanan.isEmpty()) {

            JOptionPane.showMessageDialog(
                null,
                "Belum ada pesanan yang diinput!",
                "Error Info",
                JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        String resi = JOptionPane.showInputDialog(
            "Masukkan Nomor Resi:"
        );

        if (resi == null) {
            konfirmasiKeluar();
            return;
        }

        boolean ditemukan = false;

        for (int i = 0; i < pesanan.size(); i++) {

            if (pesanan.get(i).get(0).equalsIgnoreCase(resi)) {

                ditemukan = true;

                JOptionPane.showMessageDialog(
                    null,
                    "INFORMASI TRACKING PESANAN\n\n" +
                    "Nomor Resi : " + pesanan.get(i).get(0) + "\n" +
                    "Nama       : " + pesanan.get(i).get(1) + "\n" +
                    "Tujuan     : " + pesanan.get(i).get(2) + "\n" +
                    "Berat      : " + pesanan.get(i).get(3) + " gram\n" +
                    "Jarak      : " + pesanan.get(i).get(4) + " km\n" +
                    "Total Biaya: Rp" +
                    String.format(
                        "%,.0f",
                        Double.parseDouble(pesanan.get(i).get(5))
                    ) + "\n" +
                    "Status     : " + pesanan.get(i).get(6)
                );

                break;
            }
        }

        if (!ditemukan) {

            JOptionPane.showMessageDialog(
                null,
                "Data tidak ditemukan",
                "Error Info",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}