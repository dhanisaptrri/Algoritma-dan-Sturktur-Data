public class node07 {
    String namaPeminjam;
    int lamaPinjam;
    BarangRental07 barang;
    node07 prev;
    node07 next;

    public node07(node07 prev, BarangRental07 barang, node07 next) {

        this.prev = prev;
        this.barang = barang;
        this.next = next;
        
    }

    public node07(node07 prev, BarangRental07 barang, node07 next, String namaPeminjam, int lamaPinjam) {
        this.prev = prev;
        this.barang = barang;
        this.next = next;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
    }

    // Implementasikan getter untuk mendapatkan nilai dari field namaPeminjam
    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    // Implementasikan getter untuk mendapatkan nilai dari field lamaPinjam
    public int getLamaPinjam() {
        return lamaPinjam;
    }
}