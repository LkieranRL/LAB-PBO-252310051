class Driver {
    private String namaDriver;
    private String nomorKendaraan;
    private String status;

    public Driver(String namaDriver, String nomorKendaraan) {
        this.namaDriver = namaDriver;
        this.nomorKendaraan = nomorKendaraan;
        this.status = "Menunggu pesanan";
    }

    public void ambilPesanan() {
        status = "Sedang mengambil pesanan";
        System.out.println(namaDriver + " mengambil pesanan.");
    }

    public void antarPesanan() {
        status = "Sedang mengantar pesanan";
        System.out.println(namaDriver + " mengantar pesanan.");
    }

    public String getNamaDriver() {
        return namaDriver;
    }
}

class PesananFood {
    private String namaMakanan;
    private int jumlah;
    private double hargaTotal;
    private Driver driver;

    public PesananFood(String namaMakanan, int jumlah) {
        this.namaMakanan = namaMakanan;
        this.jumlah = jumlah;
    }

    public void hitungTotal(double hargaSatuan) {
        if (hargaSatuan >= 0 && jumlah > 0) {
            hargaTotal = hargaSatuan * jumlah;
        }
    }

    public double getHargaTotal() {
        return hargaTotal;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void tampilkanPesanan() {
        System.out.println("Makanan: " + namaMakanan);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total: Rp" + hargaTotal);

        if (driver != null) {
            System.out.println(
                "Driver: " + driver.getNamaDriver()
            );
        }
    }
}

public class MainFood {
    public static void main(String[] args) {
        PesananFood pesanan =
            new PesananFood("Nasi Goreng", 2);

        Driver driver =
            new Driver("Andi", "B 1234 XYZ");

        pesanan.hitungTotal(15000);
        pesanan.setDriver(driver);

        pesanan.tampilkanPesanan();
        driver.ambilPesanan();
        driver.antarPesanan();
    }
}
