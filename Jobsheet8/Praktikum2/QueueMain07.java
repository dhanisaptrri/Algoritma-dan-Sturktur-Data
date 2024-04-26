package Praktikum2;

import java.util.Scanner;

public class QueueMain07 {

    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("------------------------------");
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        System.out.println();
        System.out.print("Masukan kapasitas queue : ");

        int jumlah = sc.nextInt();
        Queue07 antri = new Queue07(jumlah);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            try {
                switch (pilih) {
            
                    case 1:
                        System.out.print("No Rekening   : ");
                        String norek = sc.nextLine();
                        System.out.print("Nama          : ");
                        String nama= sc.nextLine();
                        System.out.print("Alamat        : "); 
                        String alamat = sc.nextLine();
                        System.out.print("Umur          : ");
                        int umur = sc.nextInt();
                        System.out.print("Saldo         : ");
                        double saldo = sc.nextDouble();
                
                        Nasabah07 nb = new Nasabah07(norek, nama, alamat, umur, saldo);
                        sc.nextLine();
                        antri.Enqueue(nb);
                        break;
    
                    case 2:
                        Nasabah07 data = antri.Dequeue();
                        if (!" ".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0) { 
                            System.out.println("Antrian yang keluar: " + data.norek + " " + data.alamat + " "  + data.umur + " " + data.nama + " " + data.saldo);
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
                        Nasabah07 rearData = antri.peekRear();
                        System.out.println("Data di posisi belakang antrian: " + rearData.norek + " " + rearData.nama + " " + rearData.alamat + " " + rearData.umur + " " + rearData.saldo);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
        
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Program dihentikan.");
                break; 
            }
       
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}

