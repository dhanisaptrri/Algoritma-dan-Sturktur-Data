import java.net.Socket;
import java.util.Scanner;

public class mainSum {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Mulai 5,9)");
        System.out.print("Masukan Jumlah Bulan : ");
        int elm = sc.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("===============================================");
        for(int i = 0; i < sm.elemen; i++){
            System.out.print("Masukan Untung Bulan ke- " + (i + 1) + " : ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("===============================================");
        System.out.println("ALGORITMA BRUTE FORCE");
        System.out.println("Total Keuntungan Perusahaan Selama " + sm.elemen + " Bulan Adalah " + sm.totalBF(sm.keuntungan));
        System.out.println("===============================================");
        System.out.println("ALGORITMA DIVIDE AND CONQUER");
        System.out.println("Total Keuntungan Perusahaan Selama " + sm.elemen + " Bulan Adalah " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
        
    }
    
}
