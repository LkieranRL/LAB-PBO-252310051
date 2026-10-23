package praktikum4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListApp {
	public static void main(String[] args) {
		ArrayList<String> nama = new ArrayList<String>(); //tipe data ArrayList pakeinya jangan int tapi Integer, atau double pakeinya D gede jadi Double
		nama.add("Rafly"); //input data
		System.out.println(nama.get(0));
		
		//input dari user menggunakan jop
		JOptionPane jop = new JOptionPane();
		nama.add(jop.showInputDialog(null, "Input Nama: "));
		jop.showMessageDialog(null, "Nama: " + nama.getLast());
		
		nama.remove(0); //menghapus sesuai index
		System.out.println("nama setelah dihapus: " + nama.get(0));
		
		//pertanyaan
//		System.out.println(nama.get(1)); //tidak akan bisa
		
		nama.add("Kieran");
		nama.add("Louren");
		System.out.println("List Nama: ");
		for (int i = 0; i < nama.size(); i++) {
			System.out.println(nama.get(i));
		}
		
		nama.clear(); //menghapus semua data
		System.out.println(nama.size());
	}
}
