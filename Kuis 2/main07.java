import java.util.Scanner;

public class main07 {

    public static void main(String[] args) {
        
        Scanner dhanisa07 = new Scanner(System.in);

        System.out.println("========= QUIZ 2 PRAKTIKUM ASD TI ==========");
        System.out.println("Dibuat oleh : Dhanisa Putri Mashilfa");
        System.out.println("NIM         : 2341720212");
        System.out.println("Absen       : 07");
        System.out.println("============================================");
        System.out.println("============Sistem Antrian Resto============");

        DLL07 antrian07 = new DLL07();

        int pilihan07;

        do {
            System.out.println("**********Menu**********");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengaturan Pesana By Dhanisa");
            System.out.println("5. Hitungan Total Pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih (1 - 5) : ");
            pilihan07 = dhanisa07.nextInt();

            switch ( pilihan07 ) {
                case 1:
                System.out.println("----------------------------------------");
                System.out.println("----------Masukan Data Pembeli----------");
                System.out.println("----------------------------------------");
                System.out.print("Nomor Antrian \t\t: ");
                int nomorPesanan7 = dhanisa07.nextInt();
                System.out.print("Nama Customer \t\t: ");
                String namaPembeli7 = dhanisa07.nextLine();
                System.out.print("Nomor Hp \t\t: ");
                String NoHp7 = dhanisa07.nextLine();
                
                Pembeli07 antri07 = new Pembeli07(NoHp7, NoHp7, nomorPesanan7);
                dhanisa07.nextLine();
                antrian07.addLast07(antri07);
                    
                    break;
            
                case 2:

                antri07.pr

                    break;
                
                case 3:
                antri07.removeLast;
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;
            }


        } while (pilihan07 != 6);
    }
}