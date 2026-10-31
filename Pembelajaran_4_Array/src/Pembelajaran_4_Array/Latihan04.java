package Pembelajaran_4_Array;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan04 {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> mahasiswa = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            ArrayList<String> data = new ArrayList<>();

            String nama = JOptionPane.showInputDialog(
                "Masukkan Nama Lengkap Mahasiswa ke-" + (i + 1)
            );

            String alamat = JOptionPane.showInputDialog(
                "Masukkan Alamat Mahasiswa ke-" + (i + 1)
            );

            String telepon = JOptionPane.showInputDialog(
                "Masukkan No Telp Mahasiswa ke-" + (i + 1)
            );

            data.add(nama);
            data.add(alamat);
            data.add(telepon);

            mahasiswa.add(data);
        }

        for (int i = 0; i < mahasiswa.size() - 1; i++) {

            for (int j = 0; j < mahasiswa.size() - 1 - i; j++) {

                String nama1 = mahasiswa.get(j).get(0);
                String nama2 = mahasiswa.get(j + 1).get(0);

                if (nama1.compareToIgnoreCase(nama2) > 0) {

                    ArrayList<String> sementara = mahasiswa.get(j);

                    mahasiswa.set(j, mahasiswa.get(j + 1));

                    mahasiswa.set(j + 1, sementara);

                }
            }
        }

        String output = "DATA MAHASISWA (ASCENDING)\n\n";

        for (int i = 0; i < mahasiswa.size(); i++) {

            output += "Mahasiswa ke-" + (i + 1) + "\n";
            output += "Nama   : " + mahasiswa.get(i).get(0) + "\n";
            output += "Alamat : " + mahasiswa.get(i).get(1) + "\n";
            output += "No Telp: " + mahasiswa.get(i).get(2) + "\n\n";

        }

        JOptionPane.showMessageDialog(null, output);

    }
}