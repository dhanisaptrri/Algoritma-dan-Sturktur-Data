import java.util.Scanner;

public class Utama07 {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukan Kapasitas Gudang : ");
        int kapasitas = sc.nextInt();
        sc.nextLine();

        Gudang07 gudang = new Gudang07(kapasitas);

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Tampilkan Barang Teratas");
            System.out.println("5. Tampilkan Barang Terbawah");
            System.out.println("6. Cari Barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih Operasi : ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:

                    System.out.print("Masukan Kode Barang : ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukan Nama Barang : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukan Nama Kategori : ");
                    String kategori = sc.nextLine();
                    Barang07 barangBaru = new Barang07(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    
                        break;
            
                case 2:
                    gudang.ambilBarang07();
                        break;
                
                case 3:
                    gudang.tampilkanBarang();
                        break;
                
                case 4:
                    gudang.lihatBarangTeratas();
                        break;
                
                case 5:
                    gudang.lihatBarangTerbawah();
                        break;
                
                case 6:
                    System.out.print("Masukan kode barang : ");
                    String kodeBarang = sc.nextLine();
                    Barang07 barangDitemukan = gudang.cariBarang(kodeBarang);
                    if (barangDitemukan != null) {
                        System.out.println("Barang yang ditemukan adalah " + barangDitemukan.nama);
                    } else {
                        System.out.println("Barang dengan kode tersebut tidak ditemukan.");
                    }
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid, Silahkan Coba Lagi.");
            }
        }

    }
    
}
