package Pembelajaran_4_Array;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan02 {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            ArrayList<Integer> barisA = new ArrayList<>();
            ArrayList<Integer> barisB = new ArrayList<>();

            for (int j = 0; j < 2; j++) {

                int nilaiA = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan Matrix A [" + i + "][" + j + "]"
                    )
                );

                int nilaiB = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan Matrix B [" + i + "][" + j + "]"
                    )
                );

                barisA.add(nilaiA);
                barisB.add(nilaiB);
            }

            A.add(barisA);
            B.add(barisB);
        }

        for (int i = 0; i < 2; i++) {

            ArrayList<Integer> barisC = new ArrayList<>();

            for (int j = 0; j < 2; j++) {

                int hasil = 0;

                for (int k = 0; k < 2; k++) {

                    hasil += A.get(i).get(k) * B.get(k).get(j);

                }

                barisC.add(hasil);
            }

            C.add(barisC);
        }

        String output = "Matrix A:\n";

        for (int i = 0; i < 2; i++) {
            output += A.get(i) + "\n";
        }

        output += "\nMatrix B:\n";

        for (int i = 0; i < 2; i++) {
            output += B.get(i) + "\n";
        }

        output += "\nHasil Perkalian Matrix C:\n";

        for (int i = 0; i < 2; i++) {
            output += C.get(i) + "\n";
        }

        JOptionPane.showMessageDialog(null, output);

    }
}