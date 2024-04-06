package TestSearching;

import java.util.Scanner;

public class BukuMain07 {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        PencarianBuku07 data = new PencarianBuku07();
        int jumBuku = 5;

        System.out.println("===========================================");
        System.out.println("Masukkan data buku secara urut dari kodeBuku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("===============");
            System.out.print("Kode Buku : ");
            String kodeBuku = sc.nextLine();
            System.out.print("Judul buku : ");
            String judulBuku = sc.nextLine();
            System.out.print("Tahun terbit : ");
            int tahunTrbt = sc1.nextInt();
            System.out.print("Pengarang : ");
            String pengarang = sc.nextLine();
            System.out.print("Stok : ");
            int stok = sc1.nextInt();

            Buku07 m = new Buku07(kodeBuku, judulBuku, tahunTrbt, pengarang, stok);
            data.tambah(m);
        }

        System.out.println("===============================================");
        System.out.println("Data keseluruhan Buku");
        System.out.println("===============================================");
        data.tampil();

        System.out.println("Masukkan kode buku yang dicari ");
        System.out.print("Kode Buku : ");
        String cari = sc.nextLine();

        System.out.println("===============================================");
        System.out.println("menggunakan sequential search ");

        int posisi = data.findseqSearch(cari);
        data.printPosisi(cari, posisi);

    }
}