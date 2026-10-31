package Pembelajaran_4_Array;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan03 {

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

        String output = "DATA MAHASISWA\n\n";

        for (int i = 0; i < mahasiswa.size(); i++) {

            output += "Mahasiswa ke-" + (i + 1) + "\n";
            output += "Nama   : " + mahasiswa.get(i).get(0) + "\n";
            output += "Alamat : " + mahasiswa.get(i).get(1) + "\n";
            output += "No Telp: " + mahasiswa.get(i).get(2) + "\n\n";

        }

        JOptionPane.showMessageDialog(null, output);

    }
}