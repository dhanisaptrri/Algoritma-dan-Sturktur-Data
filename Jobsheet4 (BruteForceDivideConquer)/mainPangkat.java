import java.util.Scanner;

public class mainPangkat {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("Masukkan jumlah elemen : ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai yang dipangkatkan: ");
            int anilai = sc.nextInt();
            png[i].nilai = anilai;
            sc.nextLine();
            System.out.println("Masukkan nilai pangkat: ");
            int apangkat = sc.nextInt();
            png[i].pangkat = apangkat;
            sc.nextLine();
        }

        System.out.println("Pilih \n 1. Brute Force \n 2. Divide Conquer");
        int pilih = sc.nextInt();
        sc.nextLine();

        switch (pilih) {
            case 1:
                System.out.println("Hasil pangkat BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " +
                            png[i].nilai + " pangkat " +
                            png[i].pangkat + " adalah " +
                            png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("Hasil pangkat Divide Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " +
                            png[i].nilai + " pangkat " +
                            png[i].pangkat + " adalah " +
                            png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;

            default:
                break;
        }

    }
}