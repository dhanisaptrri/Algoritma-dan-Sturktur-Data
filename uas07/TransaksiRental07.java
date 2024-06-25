public class TransaksiRental07 {

    public node07 head;
    public int size;
    public  double totalPendapatan;

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
    
        // Cari kendaraan dengan nomor TNKB yang sesuai
        while (current != null) {
            if (current.barang.noTNKB.equals(noTNKB)) {
                isAvailable = true;
                break;
            }
            current = current.next;
        }
    
        if (isAvailable) {
            // Check if the vehicle is already rented out
            if (current.barang.isRented()) {
                System.out.println("Kendaraan dengan nomor TNKB " + noTNKB + " sudah dipinjam.");
            } else {
                // Hitung total biaya berdasarkan harga sewa per jam dan lama peminjaman
                double totalBiaya = lamaPinjam * current.barang.biayaSewa;
    
                // Kalikan harga sewa dengan lama peminjaman
                double hargaSewa = totalBiaya;
    
                // Jika peminjam adalah member, berikan diskon 20%
                if (isMember) {
                    hargaSewa *= 0.8;
                }
    
                // Tampilkan informasi peminjaman
                System.out.println("Data Peminjaman:");
                System.out.println("Nama Peminjam: " + namaPeminjam);
                System.out.println("Nomor Kendaraan: " + noTNKB);
                System.out.println("Lama Peminjaman: " + lamaPinjam + " jam");
                System.out.println("Harga Sewa: " + hargaSewa);
    
                // Tambahkan transaksi ke daftar transaksi
                TransaksiRental07 newTransaction = new TransaksiRental07(namaPeminjam, lamaPinjam, current.barang);
                addLast(current.barang);
    
                // tandai kendaraan sebagai sudah dipinjam
                current.barang.setRented(true);
            }
        } else {
            System.out.println("Kendaraan dengan nomor TNKB " + noTNKB + " tidak tersedia untuk disewa.");
        }
    }

    public void showPreviousTransactions() {
        node07 current = head;
        System.out.println("Transaksi Sebelumnya:");
        while (current != null) {
            System.out.println("Nama Peminjam: " + current.namaPeminjam);
            System.out.println("Nomor Kendaraan: " + current.barang.noTNKB);
            System.out.println("Lama Peminjaman: " + current.lamaPinjam + " jam");
            current = current.next;
        }
    }

    // Metode untuk menampilkan total pendapatan
    public void showTotalIncome() {
        System.out.println("Total Pendapatan: " + totalPendapatan);
    }
}