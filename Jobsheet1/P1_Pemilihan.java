import java.util.Scanner;

public class P1_Pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiTugas;
        int nilaiKuis;
        int nilaiUTS;
        int nilaiUAS;

        System.out.println("**********Program Menghitung Nilai Akhir**********");
        System.out.print("Masukan Nilai Tugas : ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukan Nilai Kuis : ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukan Nilai UTS : ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukan Nilai UAS :");
        nilaiUAS = sc.nextInt();

        System.out.println("====================");

        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        if (nilaiTugas >= 0 && nilaiTugas <= 100 && nilaiKuis >= 0 && nilaiKuis <= 100 && nilaiUTS >= 0 && nilaiUTS <= 100 && nilaiUAS >= 0 && nilaiUAS <= 100);

        System.out.println("Nilai Akhir : " + nilaiAkhir);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai Huruf : A");
            System.out.println("Selamat Anda LULUS");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("Nilai Huruf : B+");
            System.out.println("Selamat Anda LULUS");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("Nilai Huruf: B");
            System.out.println("Selamat Anda LULUS");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("Nilai Huruf: C+");
            System.out.println("Selamat Anda LULUS");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("Nilai Huruf: C");
            System.out.println("Selamat Anda LULUS");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("Nilai Huruf: D");
            System.out.println("Anda TIDAK LULUS");
        } else if (nilaiAkhir <= 39) {
            System.out.println("Nilai Huruf: E");
            System.out.println("Selamat  Anda TIDAK LULUS");
        } else {
            System.out.println("Nilai tidak Valid");
        }
    }
}