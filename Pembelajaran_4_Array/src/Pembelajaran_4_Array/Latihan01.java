package Pembelajaran_4_Array;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan01 {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            ArrayList<Integer> barisA = new ArrayList<>();
            ArrayList<Integer> barisB = new ArrayList<>();

            for (int j = 0; j < 2; j++) {

                int nilaiA = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan nilai Matrix A [" + i + "][" + j + "]"
                    )
                );

                int nilaiB = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan nilai Matrix B [" + i + "][" + j + "]"
                    )
                );

                barisA.add(nilaiA);
                barisB.add(nilaiB);
            }

            A.add(barisA);
            B.add(barisB);
        }

        String output = "MATRIX A:\n";

        for (int i = 0; i < A.size(); i++) {
            output += A.get(i) + "\n";
        }

        output += "\nMATRIX B:\n";

        for (int i = 0; i < B.size(); i++) {
            output += B.get(i) + "\n";
        }

        JOptionPane.showMessageDialog(null, output);

    }
}