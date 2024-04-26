package TugasPraktikum;

import java.util.Scanner;

import Praktikum2.Nasabah07;

public class mainPembeli07 {

    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("6. Cari Posisi Pembeli");
        System.out.println("7. Tampilkan Daftar Pembeli");
        System.out.println("------------------------------");
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        System.out.println();
        System.out.print("Masukan kapasitas queue : ");

        int jumlah = sc.nextInt();
        QueuePembeli07 antri = new QueuePembeli07(jumlah);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            try {
                switch (pilih) {
            
                    case 1:
                        System.out.print("Nama Pembeli  : ");
                        String nama = sc.nextLine();
                        System.out.print("Nomor Ponsel  : ");
                        int noHP= sc.nextInt();
                
                        Pembeli07 ant = new Pembeli07(nama, noHP);
                        sc.nextLine();
                        antri.Enqueue(ant);
                        break;
    
                    case 2:
                        Pembeli07 an = antri.Dequeue();
                        if (!" ".equals(an.nama) && an.noHP != 0) { 
                            System.out.println("Antrian yang keluar: " + an.nama + " " + an.noHP);
                    break;
                    }
    
                    case 3:
                        antri.peek();
                    break;
    
                    case 4:
                        antri.print();
                    break;
    
                    case 5:
                    try {
                        Pembeli07 rearData = antri.peekRear();
                        System.out.println("Data di posisi belakang antrian: " + rearData.nama + " " + rearData.noHP + " ");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                    case 6:
                        System.out.print("Nama pembeli yang ingin dicari posisinya: ");
                        String namaPembeli = sc.nextLine();
                        antri.peekPosition(namaPembeli);
                    break;

                    case 7:
                        antri.daftarPembeli();
                }
        
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Program dihentikan.");
                break; 
            }
       
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
    
}
