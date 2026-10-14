package Selection_Repetition_Pembelajaran_02;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Resto resto = new Resto();

        char ulang;

        do {
            resto.chooseMenu(input);

            System.out.print(
                "Apakah anda akan memesan kembali ? (y/n): "
            );
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terimakasih telah memesan.");

        input.close();
    }
}