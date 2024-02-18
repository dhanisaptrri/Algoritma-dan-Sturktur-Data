import java.util.Scanner;

public class P2_Perulangan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long nim;

        System.out.print("Masukan NIM : ");
        nim = sc.nextLong();

        System.out.println("=================");
        long duadigit = nim;
        int digit = (int) (duadigit % 100);

        if (digit < 10 ) {
            digit += 10;
        }
        System.out.println("n = " + digit);

        for (int i = 1; i <= digit; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else {
                if (i % 2 == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(" * ");
                }
            }
        }
    }
}
