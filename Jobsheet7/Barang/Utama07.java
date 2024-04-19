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
            System.out.println("5. Keluar");
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
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid, Silahkan Coba Lagi.");
            }
        }

    }
    
}
