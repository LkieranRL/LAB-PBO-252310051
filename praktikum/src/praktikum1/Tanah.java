package praktikum1;

public class Tanah {

    public double luas;
    final long HARGA_TANAH = 5000000;

    public double getHargaTotal() {
        return HARGA_TANAH * luas;
    }
}