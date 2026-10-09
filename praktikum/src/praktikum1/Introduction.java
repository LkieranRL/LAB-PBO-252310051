package praktikum1;

public class Introduction {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//Variable
		int angka1 = 10;
		int angka2 = 20;
		
		//tipe data
		String nama = "Kieran";
		
		//operator
		int hasilTambah = angka1 + angka2; //pertambahan
		hasilTambah++; //increment
		
		//operator perbandingan
		boolean pembanding = angka1 > angka2;
		boolean tesNama = nama == "Kieran";
		
		//operator kondisional
		boolean kondisional = (true || false) && (true && true);
		
		//operator assignment
		angka1 += angka2; // angka1 dikali dengan angka2 hasilnya disimpan di angka1
				
		//contoh pembuatan objek
		Dog mydog = new Dog();
		mydog.hungry();
		String name = "Tomi";
		mydog.puppyName(name);
	}
}