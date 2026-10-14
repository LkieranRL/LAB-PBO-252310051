package Selection_Repetition_Pembelajaran_02;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int n = input.nextInt();

        int i = 0;
        while (i < n) {
            int j = 0;

            while (j < n - i) {
                System.out.print("*");
                j++;
            }

            j = 0;
            while (j < 2 * i + 1) {
                System.out.print(" ");
                j++;
            }

            j = 0;
            while (j < n - i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

        i = n - 2;
        while (i >= 0) {
            int j = 0;

            while (j < n - i) {
                System.out.print("*");
                j++;
            }

            j = 0;
            while (j < 2 * i + 1) {
                System.out.print(" ");
                j++;
            }

            j = 0;
            while (j < n - i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;
        }

        input.close();
    }
}