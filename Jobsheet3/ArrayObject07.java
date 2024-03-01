import java.util.Scanner;

public class ArrayObject07 {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak Persegi Panjang: ");
        int perPanj = sc.nextInt();

        PersegiPanjang07[] ppArray = new PersegiPanjang07[perPanj];

    for (int i = 0; i < perPanj; i++) {
        ppArray[i] = new PersegiPanjang07();
        System.out.println("Persegi Panjang ke -" + i);
        System.out.print("Masukkan panjang: ");
        ppArray[i].panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        ppArray[i].lebar = sc.nextInt();
    }

    for (int i = 0; i < perPanj; i++) {
        System.out.println("Persegi Panjang ke -" + i);
        System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
    }

        //ppArray[0] = new PersegiPanjang07();
        //ppArray[0].panjang = 110;
        //ppArray[0].lebar = 30;

        //ppArray[1] = new PersegiPanjang07();
        //ppArray[1].panjang = 80;
        //ppArray[1].lebar = 40;

        //ppArray[2] = new PersegiPanjang07();
        //ppArray[2].panjang = 100;
        //ppArray[2].lebar = 20;

         //System.out.println("Persegi Panjang ke-0, panjang : " + ppArray[0].panjang + ", lebar : " + ppArray[0].lebar);
        //System.out.println("Persegi Panjang ke-0, panjang : " + ppArray[1].panjang + ", lebar : " + ppArray[1].lebar);
        //System.out.println("Persegi Panjang ke-0, panjang : " + ppArray[2].panjang + ", lebar : " + ppArray[2].lebar);
            
    }
    
}
