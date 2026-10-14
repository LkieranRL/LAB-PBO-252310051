package Selection_Repetition_Pembelajaran_02;

import java.util.Scanner;

public class Latihan03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===MENU SARAPAN===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");

        System.out.print("Masukkan pilihan menu (1-3): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println(
                "Anda memesan Nasi Goreng dengan harga Rp 22.000,-"
            );
        } else if (pilihan == 2) {
            System.out.println(
                "Anda memesan Bubur Ayam dengan harga Rp 15.000,-"
            );
        } else if (pilihan == 3) {
            System.out.println(
                "Anda memesan Soto Ayam dengan harga Rp 25.000,-"
            );
        } else {
            System.out.println("Maaf menu yang anda masukan salah.");
        }

        input.close();
    }
}