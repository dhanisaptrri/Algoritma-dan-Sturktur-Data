import java.util.Scanner;

public class mainSekolahDhanisa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        dataSekolahDhanisa data = new dataSekolahDhanisa();
        int jmlSiswa = 6; 
        int menu;

        do {
            System.out.println();
            System.out.println("*****************Sekolah Dhanisa*****************");
            System.out.println("1. Masukan Data Siswa");
            System.out.println("2. Tampilkan Seluruh Data Siswa");
            System.out.println("3. Cari Nama Siswa");
            System.out.println("4. Urutkan Tahun Masuk Siswa");
            System.out.println("5. keluar");
            System.out.print("Pilih Menu : ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                System.out.println("============================================");
                System.out.println("Masukkan Data Siswa");
                for (int i = 0; i < jmlSiswa; i++) {
                    System.out.println("============================================");
                    System.out.println("Data Siswa ke-" + (i+1));
                    System.out.println("--------------------------------------------");
                    System.out.print("Masukkan NISN                 : ");
                    String nisn = sc.next();
                    sc.nextLine();
                    System.out.print("Masukkan Nama Siswa           : ");
                    String nama = sc.next();
                    sc.nextLine();
                    System.out.print("Masukkan Alamat Siswa         : ");
                    String alamat = sc.next();
                    sc.nextLine();
                    System.out.print("Masukkan Tahun Masuk Siswa    : ");
                    int tahun = sc.nextInt();
                    System.out.print("Masukkan Nilai Siswa          : ");
                    double nilai = sc.nextDouble();
        
                    sekolahDhanisa siswa = new sekolahDhanisa(nisn, nama, nama, i, i);
                    data.tambahDhanisa(siswa);
                    }
                    
                    break;
                
                case 2 : 
                    data.tampilDataDhanisa();
                    break;
                
                case 3 :
                    data.searchNamaSiswaDhanisa();
                    break;

                case 4 :
                    data.selectionSortTahunTerlamaDhanisa();
                    System.out.println("Siswa dengan Tahun Masuk Terlama : ");
                    data.tampilDataDhanisa();
                    break;
                    

                default:
                    System.out.println("Pilihan Menu Tidak Tersedia");
                    break;
            }
        } while (menu != 5);
    
}
}
