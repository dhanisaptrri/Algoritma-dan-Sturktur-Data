import java.util.Scanner;

public class main07 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TransaksiRental07 transaksi = new TransaksiRental07();

        BarangRental07 barang1 = new BarangRental07("S 4567 YV", "Honda Beat", "Motor", 2017, 10000);
        BarangRental07 barang2 = new BarangRental07("N 4511 VS", "Honda Vario", "Motor", 2018, 10000);
        BarangRental07 barang3 = new BarangRental07("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000);
        BarangRental07 barang4 = new BarangRental07("AB 4321 A", "Toyota Innova", "Mobil", 2019, 60000);
        BarangRental07 barang5 = new BarangRental07("B 1234 Ag", "Toyota Avanza", "Mobil", 2021, 25000);
        transaksi.addLast(barang1);
        transaksi.addLast(barang2);
        transaksi.addLast(barang3);
        transaksi.addLast(barang4);
        transaksi.addLast(barang5);

        int pilihan = -1;

        while (pilihan !=0) {

            System.out.println("*********MENU**********");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi Urut No TNBK");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:

                System.out.println("+++++++++++++++++++++++++++++++++++++++++");
                System.out.println("+ Daftar Kendaraan Rental Serba - Serbi +");
                System.out.println("+++++++++++++++++++++++++++++++++++++++++");
                transaksi.PrintBarang();
                    break;
            
                case 2:

                System.out.print("Masukkan Nama Peminjam : ");
                String namaPeminjam = sc.nextLine();
                System.out.print("Masukkan Nomor TNKB : ");
                String noTNKB = sc.nextLine();
                System.out.print("Masukkan Lama Pinjam : ");
                int lamaPinjam = sc.nextInt();
                sc.nextLine();
                
                // Check if the user is a member
                System.out.print("Apakah Member? (ya/tidak) : ");
                String memberStatus = sc.nextLine();
                boolean isMember = memberStatus.equalsIgnoreCase("ya");

                // Panggil method dataPeminjaman
                transaksi.dataPeminjaman(namaPeminjam, noTNKB, lamaPinjam, isMember);
                break;

                case 3:

                transaksi.showPreviousTransactions();
                transaksi.showTotalIncome();

                break;
            }
        }
    }
    
}
