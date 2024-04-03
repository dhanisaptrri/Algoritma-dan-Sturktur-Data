import java.net.Socket;
import java.util.Scanner;

public class mainHotel {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        HotelService list = new HotelService();

        Hotel htl1 = new Hotel("MAWAR", "Saranjana", 150000, (byte) 2);
        Hotel htl2 = new Hotel("JINGGA", "Saranjana", 500000, (byte) 4);
        Hotel htl3 = new Hotel("REMANG", "Saranjana", 400000, (byte) 5);
        Hotel htl4 = new Hotel("BIRU", "Saranjana", 1000000, (byte) 3);
        Hotel htl5 = new Hotel("KAKTUS", "Saranjana", 350000, (byte) 4);

        list.tambah(htl1);
        list.tambah(htl2);
        list.tambah(htl3);
        list.tambah(htl4);
        list.tambah(htl5);
        
        int memilih;
        do{
            System.out.println("+----------------------------------+");
            System.out.println("| SELAMAT DATANG DI MATAHARI TRAVEL |");
            System.out.println("+----------------------------------+");
            System.out.println();
            System.out.println("1. Hotel Terdekat");
            System.out.println("2. Tiket Perjalan");
            System.out.println("3. Rekomendasi Kuliner Terdekat");
            System.out.println("4. LOGOUT");
            System.out.print("Masukan Pilihan Anda : ");
            memilih = sc.nextInt();
        
            switch (memilih) {
                case 1:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|           REKOMENDASI HOTEL          |");
                    System.out.println("+--------------------------------------+");
                    System.out.println();
                    System.out.println("1. Harga Hotel Affordeble");
                    System.out.println("2. Hotel Rating Tertinggi");
                    System.out.print("Masukan Pilihan Anda : ");
                    int pilihHtl = sc.nextInt();

                    switch (pilihHtl) {
                        case 1:
                        System.out.println("+--------------------------------------+");
                        System.out.println("|         HOTEL HARGA AFFORDEBLE       |");
                        System.out.println("+--------------------------------------+");
                        System.out.println();
                        list.bubbleSort();
                        list.tampil();
                            
                            break;
                    
                        case 2:
                        System.out.println("+--------------------------------------+");
                        System.out.println("|         HOTEL RATING TERTINGGI       |");
                        System.out.println("+--------------------------------------+");
                        System.out.println();
                        list.selectionSort();
                        list.tampil();
                            break;
                    }
                    
                    break;
        
        }
    } while (memilih != 4);
    
}
}
