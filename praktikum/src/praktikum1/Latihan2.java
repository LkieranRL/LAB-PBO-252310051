package praktikum1;

import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {

        System.out.println("Program Menghitung Harga Tanah");

        Tanah tanah = new Tanah();

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan luas tanah: ");
        tanah.luas = input.nextDouble();

        System.out.println("Harga tanah per m²: Rp5.000.000");
        System.out.println("Harga total tanah: Rp" + tanah.getHargaTotal());

        input.close();
    }
}