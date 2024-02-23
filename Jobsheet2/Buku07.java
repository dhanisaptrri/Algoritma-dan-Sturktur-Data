public class Buku07 {

    String judul, pengarang;
    int halaman, stok, harga, totalHarga;
    double diskon;

    void tampilInformasi() {

        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : Rp " + harga);
    }

    void terjual(int jml) {
        if (stok >= jml) {
            stok -= jml;
        } else {
            throw new IllegalStateException("Mohon maaf stok buku sedang tidak tersedia");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    void hitungHargaTotal(int jml) {
        totalHarga = harga * jml;
        System.out.println("harga total belanja : " + totalHarga);
    }

    void hitungDiskon() {
        if (totalHarga > 150000) {
            diskon = totalHarga * 0.12;
        } else if (totalHarga >= 75000 && totalHarga <= 150000) {
            diskon = totalHarga * 0.5;
        } else {
            diskon = 0;
        }
        System.out.println("harga diskon : " + diskon);
    }

    void hitungHargaBayar() {
        totalHarga -= diskon;
        System.out.println("harga yang harus dibayar : " + totalHarga);
    }

    public Buku07() {

    }

    public Buku07(String jud, String pg, int hal, int stok, int har) {
        
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

}