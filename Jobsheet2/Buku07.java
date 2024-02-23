public class Buku07 {

    String judul, pengarang;
    int halaman, stok, harga;

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