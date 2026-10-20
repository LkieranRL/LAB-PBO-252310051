package praktikum3;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String nama, NPM;
		int umur;
		
		int confirm = 0;
		
		do {
			nama = jop.showInputDialog(null, "Masukkan nama anda", "input", jop.QUESTION_MESSAGE);
			confirm = jop.showConfirmDialog(null, "apakah anda yakin nama anda sudah sesuai " + nama);
			
			if (confirm == 2) {
				return;
			}
		} while (confirm != 0);
		
		NPM = jop.showInputDialog(null, "input NPM", "252310051");
		umur = Integer.parseInt(jop.showInputDialog(null, "Input umur"));
		
		String output = "Nama: " + nama + "\n" + "NPM: " + NPM + "\n" + "Umur: " + umur;
		jop.showMessageDialog(null, output, "Biodata", jop.ERROR_MESSAGE);
	}
} 
