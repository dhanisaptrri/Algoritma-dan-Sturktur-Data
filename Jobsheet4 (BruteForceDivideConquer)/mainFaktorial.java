import java.util.Scanner;

public class mainFaktorial {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.print("Masukan Jumlah Elemen : ");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[10];
        for(int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukan Nilai Data ke-" + (i+1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("HASIL - BRUTE FORCE");
        for(int i = 0; i < iJml; i++) {
            System.out.println("Hasil Penghitungan Menggunakan Brute Force Adalah " + fk[i].faktorialBf(fk[i].nilai));
        }

        System.out.println("HASIL - DIVIDE AND CONQUER");
        for(int i = 0; i < iJml; i++) {
            System.out.println("Hasil Penghitungan Menggunakan Divide and Conquer Adalah " + fk[i].fakorialDC(fk[i].nilai));
        }
    }
    
}
