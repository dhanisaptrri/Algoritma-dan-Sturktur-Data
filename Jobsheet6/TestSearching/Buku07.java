package TestSearching;

public class Buku07 {

    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stok;

    public Buku07(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stok) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    void tampilBuku() {
        System.out.println("======================");
        System.out.println("Kode Buku           : " + kodeBuku);
        System.out.println("Judul Buku          : " + judulBuku);
        System.out.println("Tahun Terbit Buku   : " + tahunTerbit);
        System.out.println("Pengarang           : " + pengarang);
        System.out.println("Stok Buku           : " + stok);
    }

}