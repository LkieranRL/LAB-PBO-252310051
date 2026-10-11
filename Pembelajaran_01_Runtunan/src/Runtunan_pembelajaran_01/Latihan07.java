package Runtunan_pembelajaran_01;

import java.util.Scanner;

public class Latihan07 {
	public static void main(String[] args) {
		String txt;
		String Convert;
			
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukan Text: ");
		txt = scanner.nextLine();
			
		Convert = txt.replaceAll("[AIUEOaiueo]", "X");
		System.out.println("Text Terkonversi: " + Convert);
		
	}

}