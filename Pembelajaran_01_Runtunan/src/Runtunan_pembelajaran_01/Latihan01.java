package Runtunan_pembelajaran_01;

import java.util.Scanner;

public class Latihan01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celcius;
        double fahrenheit;
        double reamur;
        double kelvin;

        System.out.print("Masukkan suhu dalam Celcius: ");
        celcius = input.nextDouble();

        fahrenheit = (celcius * 9 / 5) + 32;
        reamur = celcius * 4 / 5;
        kelvin = celcius + 273.15;

        System.out.println("\n===KONVERSI SUHU===");
        System.out.println("Celcius    : " + celcius + " C");
        System.out.println("Fahrenheit : " + fahrenheit + " F");
        System.out.println("Reamur     : " + reamur + " R");
        System.out.println("Kelvin     : " + kelvin + " K");

        input.close();
    }
}