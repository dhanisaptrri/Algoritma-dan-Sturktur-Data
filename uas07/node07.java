public class node07 {

    BarangRental07 barang;
    node07 prev;
    node07 next;

    public node07(node07 prev, BarangRental07 barang, node07 next) {

        this.prev = prev;
        this.barang = barang;
        this.next = next;
        
    }
}