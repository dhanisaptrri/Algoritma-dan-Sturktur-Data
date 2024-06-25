public class BarangRental07 {

    String noTNKB;
    String namaKendaraan;
    String jenisKendaraaan;
    int tahun;
    int biayaSewa;
    boolean isRented;

    BarangRental07(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa) {

        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraaan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
        this.isRented = false;
        
    }

    BarangRental07 () {
        
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}