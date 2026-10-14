package Selection_Repetition_Pembelajaran_02;

import java.util.Scanner;

public class Resto {

    private long Harga;

    private Long getPrices(int pilihan) {
        if (pilihan == 1) {
            Harga = 22000;
        } else if (pilihan == 2) {
            Harga = 15000;
        } else if (pilihan == 3) {
            Harga = 25000;
        } else {
            Harga = 0;
        }

        return Harga;
    }

    public void chooseMenu(Scanner input) {
        System.out.println("===MENU SARAPAN===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");

        System.out.print("Masukkan pilihan menu (1-3): ");
        int pilihan = input.nextInt();

        if (pilihan >= 1 && pilihan <= 3) {
            long harga = getPrices(pilihan);
            String hargaFormat = String.format("%,d", harga)
                                      .replace(',', '.');

            if (pilihan == 1) {
                System.out.println(
                    "Anda memesan Nasi Goreng dengan harga Rp "
                    + hargaFormat + ",-"
                );
            } else if (pilihan == 2) {
                System.out.println(
                    "Anda memesan Bubur Ayam dengan harga Rp "
                    + hargaFormat + ",-"
                );
            } else if (pilihan == 3) {
                System.out.println(
                    "Anda memesan Soto Ayam dengan harga Rp "
                    + hargaFormat + ",-"
                );
            }
        } else {
            System.out.println(
                "Maaf menu yang anda masukan salah."
            );
        }
    }
}
