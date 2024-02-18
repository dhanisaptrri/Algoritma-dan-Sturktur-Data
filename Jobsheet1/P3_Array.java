import java.util.Scanner;

public class P3_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] mataKuliah = {"Pancasila                               ", "Konsep Teknologi Informasi              ", "Critical Thinking and Problem Solving   ", "Matematika Dasar                        ", "Dasar Pemrograman                       ", "Praktikum Dasar Pemrograman             ", "Keselmatan dan Kesehatan Kerja          "};
        double[] nilai = new double[8];
        int[] bobotSKS = {2, 2, 2, 3, 2, 2, 3, 2};
        double sigmaI = 0;
        int jumlahSKS = 18;

        System.out.println("==========================");
        System.out.println("Menghitung IP SEMSETER");
        System.out.println("==========================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan Nilai " + mataKuliah[i] + " : ");
            nilai[i] = sc.nextDouble();
        }

        int[] nilaiHuruf = new int[nilai.length];

        for (int i = 0; i < nilai.length; i++) {
            nilaiHuruf[i] = (int) nilai[i];
        }

        String[] NilaiHuruf = new String[nilaiHuruf.length];
        double[] beratSKS = new double[nilaiHuruf.length];
        for (int i = 0; i < nilaiHuruf.length; i++) {
            if (nilaiHuruf[i] > 80 && nilaiHuruf[i] <= 100) {
                NilaiHuruf[i] = "A";
                beratSKS[i] = 4;
            } else if (nilaiHuruf[i] > 73 && nilaiHuruf[i] <= 80) {
                NilaiHuruf[i] = "B+";
                beratSKS[i] = 3.5;
            } else if (nilaiHuruf[i] > 65 && nilaiHuruf[i] <= 73) {
                NilaiHuruf[i] = "B";
                beratSKS[i] = 3;
            } else if (nilaiHuruf[i] > 60 && nilaiHuruf[i] <= 65) {
                NilaiHuruf[i] = "C+";
                beratSKS[i] = 2.5;
            } else if (nilaiHuruf[i] > 50 && nilaiHuruf[i] <= 60) {
                NilaiHuruf[i] = "C";
                beratSKS[i] = 2;
            } else if (nilaiHuruf[i] > 39 && nilaiHuruf[i] <= 50) {
                NilaiHuruf[i] = "D";
                beratSKS[i] = 1;
            } else if (nilaiHuruf[i] <= 39) {
                NilaiHuruf[i] = "E";
                beratSKS[i] = 0;
            }
        }

        for (int i = 0; i < beratSKS.length; i++) {
            sigmaI += beratSKS[i] * bobotSKS[i];
        }

        double ipSemester = sigmaI / jumlahSKS;

        System.out.println("==========================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==========================");

        System.out.printf("%-15s %-15s %-15s  %-15s \n", "          MATA KULIAH", "                 Nilai Angka", "     Nilai Huruf","  Bobot Nilai");
        for (int i = 0; i < mataKuliah.length; i++) {
            if (mataKuliah[i] != null) {
                System.out.printf("%-15s %-15.1f %-15s  %-15.1f \n", mataKuliah[i], nilai[i], NilaiHuruf[i], beratSKS[i]);
            }
        }
        System.out.println("======================");
        System.out.print("IP : " + ipSemester);


    }
    
}
