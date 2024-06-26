import java.util.ArrayList;
import java.util.List;

public class TransaksiRental07 {

    public node07 head;
    public int size;
    public  double totalPendapatan;

    List<String> riwayatTransaksi = new ArrayList<>();

    int kodeTransaksi = 1;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental07 barang;

    TransaksiRental07() {
        head = null;
        size = 0;
        totalPendapatan = 0; 
    }

    TransaksiRental07 (String nama, int lama, BarangRental07 barang) {

        kodeTransaksi += 1;
        namaPeminjam = nama;
        lamaPinjam = lama;
        totalBiaya = lama * barang.biayaSewa;
        this.barang = barang;
    }

    public void tambahTransaksiKeRiwayat(String transaksiData) {
        riwayatTransaksi.add(transaksiData);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void size() {
        System.out.println(size);
    }


    public void addLast(BarangRental07 barang) {
        if (isEmpty()) {
            head = new node07(null, barang, head);

        } else {
            node07 nw = new node07(null, barang, head);
            head.prev = nw;
            head = nw;
        }
        size++;
    }

    public void PrintBarang() {
        node07 current = head;
        System.out.printf("| %-12s | %-20s | %-12s | %-7s | %-20s\n", "No TNKB", "Nama Kendaraan", "Jenis", "Tahun", "Biaya Sewa Perjam");
        while (current != null) {
            System.out.printf("| %-12s | %-20s | %-12s | %-7d | %-20s\n", current.barang.noTNKB, current.barang.namaKendaraan, current.barang.jenisKendaraaan, current.barang.tahun, current.barang.biayaSewa);

            current = current.next;
        }
    }

    

    public void dataPeminjaman(String namaPeminjam, String noTNKB, int lamaPinjam, boolean isMember) {
        boolean isAvailable = false;
        node07 current = head;
        String namaKendaraan = ""; // Inisialisasi nama kendaraan
    
        while (current != null) {
            if (current.barang.noTNKB.equals(noTNKB)) {
                isAvailable = true;
                namaKendaraan = current.barang.namaKendaraan; // Simpan nama kendaraan
                break;
            }
            current = current.next;
        }
    
        if (isAvailable) {
            if (current.barang.isRented()) {
                System.out.println("Kendaraan dengan nomor TNKB " + noTNKB + " sudah dipinjam.");
            } else {
                double totalBiaya = lamaPinjam * current.barang.biayaSewa;
                double hargaSewa = totalBiaya;
    
                if (isMember) {
                    hargaSewa *= 0.8;
                }
    
                String transaksiData = namaPeminjam + " - " + noTNKB + " - " + namaKendaraan + " - " + lamaPinjam + " - " + hargaSewa;
                tambahTransaksiKeRiwayat(transaksiData);
    
                System.out.println("Data Peminjaman:");
                System.out.println("Nama Peminjam: " + namaPeminjam);
                System.out.println("Nomor Kendaraan: " + noTNKB);
                System.out.println("Nama Kendaraan: " + namaKendaraan);
                System.out.println("Lama Peminjaman: " + lamaPinjam + " jam");
                System.out.println("Harga Sewa: " + hargaSewa);
    
                TransaksiRental07 newTransaction = new TransaksiRental07(namaPeminjam, lamaPinjam, current.barang);
                addLast(current.barang);
    
                current.barang.setRented(true);
            }
        } else {
            System.out.println("Kendaraan dengan nomor TNKB " + noTNKB + " tidak tersedia untuk disewa.");
        }
    }
    
    public void showPreviousTransactions() {
        System.out.println("Riwayat Transaksi:");
        System.out.printf("| %-12s | %-20s | %-20s | %-20s | %-20s\n", "No TNKB", "Nama Barang", "Nama Peminjam", "Lama Pinjam", "Total Biaya");
        for (String transaksi : riwayatTransaksi) {
            String[] dataTransaksi = transaksi.split(" - ");
            System.out.printf("| %-12s | %-20s | %-20s | %-20s | %-20s\n", dataTransaksi[1], dataTransaksi[2], dataTransaksi[0], dataTransaksi[3], dataTransaksi[4]); 
        }
    }

    // Metode untuk menampilkan total pendapatan
    public void showTotalIncome() {
        System.out.println("Total Pendapatan: " + totalPendapatan);
    }
}