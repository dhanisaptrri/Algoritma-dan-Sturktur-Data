package TestSearching;

import java.util.Scanner;

public class BukuMain07 {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        PencarianBuku07 data = new PencarianBuku07();
        int jumBuku = 5;

        System.out.println("--------------------------------------------------------------");
        System.out.println("Masukkan data buku secara urut dari kodeBuku terkecil : ");
        for (int j = 0; j < jumBuku; j++) {
            System.out.println("________________________________________________");
            System.out.print("Kode Buku     \t: ");
            String kodeBuku = sc.nextLine();
            System.out.print("Judul buku    \t: ");
            String judulBuku = sc.nextLine();
            System.out.print("Tahun terbit  \t: ");
            int tahunTerbit = sc1.nextInt();
            System.out.print("Pengarang     \t: ");
            String pengarang = sc.nextLine();
            System.out.print("Stok          \t: ");
            int stok = sc1.nextInt();

            Buku07 m = new Buku07(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
            data.tambah(m);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("Data keseluruhan Buku");
        System.out.println("--------------------------------------------------------------");
        data.tampil();

        System.out.println("--------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Pencarian Data  : ");
        System.out.println("Masukkan kode buku yang dicari ");
        System.out.print("Kode Buku : ");
        String cari = sc.nextLine();

        System.out.println("--------------------------------------------------------------");
        System.out.println("menggunakan sequential search ");

        int posisi = data.findseqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("--------------------------------------------------------------");
        System.out.println("menggunakan binary search ");

        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

    }
}