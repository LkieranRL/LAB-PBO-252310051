package Pembelajaran_3_Swing_1;


import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        Biodata data = new Biodata();

        String fullname = JOptionPane.showInputDialog(
            null, "Masukkan nama lengkap:"
        );

        String inputUsia = JOptionPane.showInputDialog(
            null, "Masukkan usia:"
        );

        int usia = Integer.parseInt(inputUsia);

        String alamat = JOptionPane.showInputDialog(
            null, "Masukkan alamat:"
        );

        data.setBiodata(fullname, usia, alamat);

        JOptionPane.showMessageDialog(
            null,
            "Nama Lengkap: " + data.getFullname()
            + "\nUsia: " + data.getUsia()
            + " tahun\nAlamat: " + data.getAlamat(),
            "Data Biodata",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}