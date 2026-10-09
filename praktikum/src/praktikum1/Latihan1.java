package praktikum1;

import java.util.Scanner;

public class Latihan1 {
	public static void main(String[] args) {
		System.out.println("Program Menghitung Volume Balok");
		
		Balok balok = new Balok();
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukan panjang balok: ");
		balok.panjang = input.nextDouble();
		
		System.out.print("masukan lebar balok: ");
		balok.lebar = input.nextDouble();
		
		System.out.print("masukan tinggi balok: ");
		balok.tinggi = input.nextDouble();
		
		System.out.print("Volume dari balok: " + balok.getVolume());
	}
}
