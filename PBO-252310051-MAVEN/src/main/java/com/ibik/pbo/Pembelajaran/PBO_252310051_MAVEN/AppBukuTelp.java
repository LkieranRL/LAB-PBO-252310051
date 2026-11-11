package com.ibik.pbo.Pembelajaran.PBO_252310051_MAVEN;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppBukuTelp {

    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();

        ArrayList<ArrayList<String>> kontak = new ArrayList<>();

        nama.add("Septian Cahyadi");
        nama.add("Isnan Mulia");
        nama.add("Edi Nurachmand");

        ArrayList<String> data1 = new ArrayList<>();
        data1.add("Dramaga cantik residance II, Bogor");
        data1.add("+62 899-9506-210");
        kontak.add(data1);

        ArrayList<String> data2 = new ArrayList<>();
        data2.add("Jl.Manunggal, Bogor");
        data2.add("+62 819-3208-0875");
        kontak.add(data2);

        ArrayList<String> data3 = new ArrayList<>();
        data3.add("Taman Cimanggu Permai, Bogor");
        data3.add("+62 856-9380-0384");
        kontak.add(data3);

        boolean jalan = true;

        while (jalan) {

            String menu = JOptionPane.showInputDialog(
                "BUKU TELEPON\n\n" +
                "1. Lihat Semua Kontak\n" +
                "2. Tambah Kontak\n" +
                "3. Keluar\n\n" +
                "Pilih menu:"
            );

            if (menu == null) {
                break;
            }

            switch (menu) {

                case "1":

                    StringBuilder hasil = new StringBuilder();

                    hasil.append("DAFTAR BUKU TELEPON\n\n");

                    for (int i = 0; i < nama.size(); i++) {

                        hasil.append("Nama   : ")
                             .append(nama.get(i)).append("\n");

                        hasil.append("Alamat : ")
                             .append(kontak.get(i).get(0)).append("\n");

                        hasil.append("Telp   : ")
                             .append(kontak.get(i).get(1)).append("\n\n");
                    }

                    JOptionPane.showMessageDialog(null, hasil.toString());
                    break;

                case "2":

                    String namaBaru = JOptionPane.showInputDialog(
                        "Masukkan Nama Lengkap:"
                    );

                    if (namaBaru == null) break;

                    String alamatBaru = JOptionPane.showInputDialog(
                        "Masukkan Alamat:"
                    );

                    if (alamatBaru == null) break;

                    String telpBaru = JOptionPane.showInputDialog(
                        "Masukkan Nomor Telepon:"
                    );

                    if (telpBaru == null) break;

                    nama.add(namaBaru);

                    ArrayList<String> dataBaru = new ArrayList<>();
                    dataBaru.add(alamatBaru);
                    dataBaru.add(telpBaru);

                    kontak.add(dataBaru);

                    JOptionPane.showMessageDialog(
                        null, "Kontak berhasil ditambahkan!"
                    );

                    break;

                case "3":
                    jalan = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(
                        null, "Menu tidak tersedia!"
                    );
            }
        }
    }
}