import java.util.Scanner;

public class mainPangkat {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.print("Masukan Jumlah Elemen Yang Akan Dihitung : ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for(int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.println();
            System.out.print("Masukan Nilai Yang Hendak Dipangkatkan : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukan Nilai Pemangkatan : ");
            png[i].pangkat = sc.nextInt();
        }

        System.out.println();
        System.out.println("*****HASIL PANGKAT - BRUTE FORCE*****");
        for(int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println();
        System.out.println("*****HASIL PANGKAT - DIVIDE AND CONQUER*****");
        for(int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
    
}
