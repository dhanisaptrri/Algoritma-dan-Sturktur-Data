import java.util.Scanner;

public class P4_Fungsi {

    static String[] cabangToko = { "Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4" };
    static String[] jenisBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
    static double[] hargaJual = { 75000, 50000, 60000, 10000 };
    static int[][] stokBunga = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };

    static int omsetCabang(int toko) {
        int pendapatan = 0;
        int cabangToko = toko;
        cabangToko -= 1;
        for (int i = 0; i < jenisBunga.length; i++) {
            pendapatan += (hargaJual[i] * stokBunga[cabangToko][i]);
        }
        return pendapatan;
    }

    static void ketersedianStok(int toko) {
        int cabangToko = toko;
        cabangToko -= 1;

  
        if (cabangToko == 3) {
            stokBunga[cabangToko][0] -= 1;
            stokBunga[cabangToko][1] -= 2;
            stokBunga[cabangToko][2] -= 0;
            stokBunga[cabangToko][3] -= 5;
            System.out.printf("%-15s %-15s %-15s  %-15s \n", "Algonema", "Keladi", "Alocasia",
                    "Mawar");

            System.out.printf("%-15d %-15d %-15d  %-15d \n", stokBunga[cabangToko][0], stokBunga[cabangToko][1],
                    stokBunga[cabangToko][2], stokBunga[cabangToko][3]);
            System.out.println(
                    "Berikut Perubahan data stok bunga yang mati : ");
                    System.out.println("-1 Aglonema");
                    System.out.println("-2 kedelai");
                    System.out.println("0 Alacasia");
                    System.out.println("-5 Mawar");
        } else {

            System.out.printf("%-15s %-15s %-15s  %-15s \n", "Algonema", "Keladi", "Alocasia",
                    "Mawar");

            System.out.printf("%-15d %-15d %-15d  %-15d \n", stokBunga[cabangToko][0], stokBunga[cabangToko][1],
                    stokBunga[cabangToko][2], stokBunga[cabangToko][3]);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fitur;
        do {
            System.out.println("*****Data Cabang Royal Garden*****");
            System.out.println("1. Cek Omset Cabang");
            System.out.println("2. Cek Stok Bunga Cabang");
            System.out.println("0. Keluar");
            System.out.print("Pilih Angka: ");
            fitur = input.nextInt();

            switch (fitur) {
                case 1:
                    int cabangToko;
                    System.out.println("*****OMSET CABANG*****");
                    System.out.println("1. Royal Garden 1");
                    System.out.println("2. Royal Garden 2");
                    System.out.println("3. Royal Garden 3");
                    System.out.println("4. Royal Garden 4");
                    System.out.print("Pilih Angka Toko Cabang: ");
                    cabangToko = input.nextInt();
                    int penghasilan = omsetCabang(cabangToko);
                    System.out.println("Pendapatan Cabang Royal Garden " + cabangToko + " : " + penghasilan);
                    break;

                case 2:
                    int Toko;
                    System.out.println("*****Daftar Stok Barang*****");
                    System.out.println("1. Royal Garden 1");
                    System.out.println("2. Royal Garden 2");
                    System.out.println("3. Royal Garden 3");
                    System.out.println("4. Royal Garden 4");
                    System.out.print("Pilih Angka Toko Cabang: ");
                    Toko = input.nextInt();
                    ketersedianStok(Toko);
                    break;
                default:
                    System.out.println("Pilih Toko Cabang");
                    break;
            }

        } while (fitur != 0);

    }
}