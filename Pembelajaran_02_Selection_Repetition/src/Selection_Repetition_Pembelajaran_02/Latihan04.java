package Selection_Repetition_Pembelajaran_02;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM Anda: ");
        long npm = input.nextLong();

        System.out.print("Masukkan nilai faktor (minimal 20): ");
        int faktor = input.nextInt();

        if (faktor < 20) {
            System.out.println("Nilai faktor tidak boleh kurang dari 20.");
        } else {
            System.out.print("Faktor " + faktor + " adalah ");

            if (npm % 2 == 0) {
                for (int i = 1; i <= faktor; i++) {
                    if (faktor % i == 0) {
                        System.out.print(i);

                        if (i < faktor) {
                            System.out.print(", ");
                        }
                    }
                }
            } else {
                boolean pertama = true;

                for (int i = faktor; i >= 1; i--) {
                    if (faktor % i == 0) {
                        if (!pertama) {
                            System.out.print(", ");
                        }

                        System.out.print(i);
                        pertama = false;
                    }
                }
            }

            System.out.println();
        }

        input.close();
    }
}