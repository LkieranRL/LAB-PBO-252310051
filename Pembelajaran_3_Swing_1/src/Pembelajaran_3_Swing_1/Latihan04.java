package Pembelajaran_3_Swing_1;

import javax.swing.JOptionPane;

public class Latihan04 {

    public static boolean konfirmasiKeluar() {
        int pilihan = JOptionPane.showConfirmDialog(
            null,
            "Apakah anda ingin keluar ?",
            "Konfirmasi Keluar",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        return pilihan == JOptionPane.YES_OPTION;
    }

    public static String inputData(String pesan) {
        while (true) {
            String hasil = JOptionPane.showInputDialog(
                null, pesan
            );

            if (hasil == null) {
                if (konfirmasiKeluar()) {
                    System.exit(0);
                }
            } else {
                return hasil;
            }
        }
    }

    public static void main(String[] args) {
        Biodata data = new Biodata();

        while (true) {
            String fullname;
            String inputUsia;
            String alamat;
            int usia;

            while (true) {
                fullname = inputData("Masukkan nama lengkap:");

                if (fullname.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Field fullname tidak boleh kosong",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                } else {
                    break;
                }
            }

            while (true) {
                inputUsia = inputData("Masukkan usia:");

                if (inputUsia.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Field usia tidak boleh kosong",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                    continue;
                }

                try {
                    usia = Integer.parseInt(inputUsia.trim());

                    if (usia < 0) {
                        JOptionPane.showMessageDialog(
                            null,
                            "Isian usia harus angka",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                        );
                        continue;
                    }

                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Isian usia harus angka",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }

            while (true) {
                alamat = inputData("Masukkan alamat:");

                if (alamat.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Field alamat tidak boleh kosong",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                } else if (alamat.trim().length() < 10) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Masukan alamat minimum 10 karakter",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                    );
                } else {
                    break;
                }
            }

            data.setBiodata(fullname.trim(), usia, alamat.trim());

            JOptionPane.showMessageDialog(
                null,
                "Nama Lengkap: " + data.getFullname()
                + "\nUsia: " + data.getUsia() + " tahun"
                + "\nAlamat: " + data.getAlamat(),
                "Data Biodata",
                JOptionPane.INFORMATION_MESSAGE
            );

            if (konfirmasiKeluar()) {
                System.exit(0);
            }

        }
    }
}