package TestSearching;

import java.util.Scanner;

public class BukuMain07 {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        PencarianBuku07 data = new PencarianBuku07();
        int jumBuku = 5;

       // System.out.println("--------------------------------------------------------------");
        //System.out.println("Masukkan data buku secara urut dari kodeBuku terkecil : ");
        //for (int j = 0; j < jumBuku; j++) {
          //  System.out.println("________________________________________________");
            //System.out.print("Kode Buku     \t: ");
 //           String kodeBuku = sc.nextLine();
   //         System.out.print("Judul buku    \t: ");
     //       String judulBuku = sc.nextLine();
       //     System.out.print("Tahun terbit  \t: ");
         //   int tahunTerbit = sc1.nextInt();
           // System.out.print("Pengarang     \t: ");
//            String pengarang = sc.nextLine();
  //          System.out.print("Stok          \t: ");
    //        int stok = sc1.nextInt();
//
  //          Buku07 m = new Buku07(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
    //        data.tambah(m);
      //  }

       // System.out.println("--------------------------------------------------------------");
        //System.out.println("Data keseluruhan Buku");
        //System.out.println("--------------------------------------------------------------");
        //data.print();

//        System.out.println("--------------------------------------------------------------");
  //      System.out.println("--------------------------------------------------------------");
    //    System.out.println("Pencarian Data  : ");
      //  System.out.println("Masukkan kode buku yang dicari ");
        //System.out.print("Kode Buku : ");
        //String cari = sc.nextLine();

//        System.out.println("--------------------------------------------------------------");
  //      System.out.println("menggunakan sequential search ");
//
  //      int posisi = data.findseqSearch(cari);
    //    data.tampilPosisi(cari, posisi);
      //  data.TampilData(cari, posisi);

        //System.out.println("--------------------------------------------------------------");
        //System.out.println("menggunakan binary search ");

        //posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        //data.tampilPosisi(cari, posisi);
        //data.TampilData(cari, posisi);


        Buku07 m1 = new Buku07("1", "dilan 1990", 2015, "pidi baiq", 1);
        Buku07 m2 = new Buku07("2", "dilan 1990", 2016, "pidi baiq", 2);
        Buku07 m3 = new Buku07("3", "milea 1990", 2017, "pidi baiq", 3);
        Buku07 m4 = new Buku07("4", "ancika", 2021, "pidi baiq", 4);
        Buku07 m5 = new Buku07("5", "bundahara", 2025, "pidi baiq", 5);

        data.tambah(m5);
        data.tambah(m4);
        data.tambah(m3);
        data.tambah(m1);
        data.tambah(m2);

        System.out.println("===============================================");
        System.out.println("Data keseluruhan Buku");
        System.out.println("===============================================");
        data.tampil();

        System.out.println("==================================================");
        System.out.println("1. kode buku");
        System.out.println("2. nama buku");
        System.out.print("Pencarian Data berdasarkan : ");
        int pilih = sc1.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("===============================================");
                System.out.println("Masukkan kode buku yang dicari ");
                System.out.print("Kode Buku : ");
                String cari = sc.nextLine();
                System.out.println("menggunakan binary search");
                data.StrInsertionSortAsc();
                int posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
                data.tampilPosisi(cari, posisi);
                data.TampilData(cari, posisi);
                System.out.println("===============================================");
                System.out.println("menggunakan sequential search ");

                int posisii = data.findseqSearch(cari);
                data.tampilPosisi(cari, posisii);
                data.TampilData(cari, posisii);

                break;
            case 2:
                System.out.println("===============================================");
                System.out.println("===============================================");
                System.out.println("Masukkan nama buku yang dicari: ");
                System.out.print("nama Buku : ");
                String carii = sc.nextLine();

                int dbl = data.judulSama(carii);
                if (dbl > 1) {
                    System.out.println("+-----------------------------------------------------------------+");
                    System.out.println("| Buku dengan judul " + carii + " memiiliki lebih dari 1              |");
                    System.out.println("+-----------------------------------------------------------------+");
                } else {
                    System.out.println("menggunakna sequential search");
                    Buku07 dabuk = data.findbuku(carii);
                    dabuk.tampilBuku();

                    System.out.println("===============================================");
                    System.out.println("menggunakan Binary search ");
                    data.binaryCariJudul();
                    int posisiii = data.binaryCariBuku(carii, 0, jumBuku - 1);
                  
                    data.tampilPosisi(carii, posisiii);
                    data.TampilData(carii, posisiii);
                }

                break;

            default:
                System.out.println("Pilih 1 atau 2");
                break;
        }

        sc.close();
        sc1.close();
    }
}