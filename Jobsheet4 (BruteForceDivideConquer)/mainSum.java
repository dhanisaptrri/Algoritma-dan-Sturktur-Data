import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================");
        System.out.println("Program menghitung keuntungan total(satuan JUTA. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int company = sc.nextInt();
        sc.nextLine();

        Sum[] sm = new Sum[company];

        for (int i = 0; i < company; i++) {
            System.out.println("=========================================================");
            System.out.print("Masukkan jumlah bulan perusahaan " + (i + 1) + " : ");
            int bulan = sc.nextInt();
            sc.nextLine();
            sm[i] = new Sum(bulan, company);
            sm[i].perusahaan = bulan;
            System.out.println("=========================================================");
            for (int j = 0; j < bulan; j++) {
                System.out.print("Masukkan untung bulan ke " + (j + 1) + " : ");
                sm[i].keuntungan[j] = sc.nextDouble();
                sc.nextLine();
            }
        }

        System.out.println("ALGORITMA BRUTE FORCE");
        for(int i = 0; i < company; i++){
        System.out.println("Total Keuntungan Perusahaan " + (i + 1) +  " Selama " + sm[i].elemen + " Bulan Adalah " + sm[i].totalBF(sm[i].keuntungan));
        System.out.println();
        }

        for(int i = 0; i < company; i++){
        System.out.println("ALGORITMA DIVIDE AND CONQUER");
        System.out.println("Total Keuntungan Perusahaan " + (i + 1) + " Selama " + sm[i].elemen + " Bulan Adalah " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));
        System.out.println();
        }
        
    }
}