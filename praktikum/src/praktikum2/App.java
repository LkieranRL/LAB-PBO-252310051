package praktikum2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.print("Masukkan sisi a: ");
        a = scanner.nextInt();

        System.out.print("Masukkan sisi b: ");
        b = scanner.nextInt();

        System.out.print("Masukkan sisi c: ");
        c = scanner.nextInt();

        segitiga segitiga = new segitiga(a, b, c);
        
	        if (a * a + b * b == c * c) {
	            System.out.println("Segitiga sempurna");
	        } else {
	            System.out.println("Bukan segitiga sempurna");
	        }
    }
}
