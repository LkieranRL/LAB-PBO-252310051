package Pembelajaran_3_Swing_1;

import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        Biodata data = new Biodata();

        String fullname;
        String inputUsia;
        String alamat;
        int usia;

        while (true) {
            fullname = JOptionPane.showInputDialog(
                null, "Masukkan nama lengkap:"
            );

            if (fullname == null || fullname.trim().isEmpty()) {
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
            inputUsia = JOptionPane.showInputDialog(
                null, "Masukkan usia:"
            );

            if (inputUsia == null || inputUsia.trim().isEmpty()) {
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
            alamat = JOptionPane.showInputDialog(
                null, "Masukkan alamat:"
            );

            if (alamat == null || alamat.trim().isEmpty()) {
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
    }
}