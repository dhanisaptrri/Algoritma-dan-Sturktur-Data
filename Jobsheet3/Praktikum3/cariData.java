package Praktikum3;

public class cariData {

    public String nama;
    public int nim;
    public String jnsKelamin;
    public double ipk;

        public static void mencariRata2(cariData[] inputMhs) {
            double jml = 0;
            for (int i = 0; i < inputMhs.length; i++) {
                jml += inputMhs[i].ipk;
            }

            double rata2 = jml / inputMhs.length;
            System.out.println();
            System.out.println("================================");
            System.out.println("Rata - Rata IPK : " + rata2);
            System.out.println("================================");

        }

        public static void nilaiTinggi(cariData[] inputMhs) {
            double nilai = inputMhs[0].ipk;
            int index = -1;
            
            for (int i = 0; i < inputMhs.length; i++) {
                if (inputMhs[i].ipk > nilai);
                index = i;
            }

            System.out.println();
            System.out.println("Mahasiswa denganIPK Tertinggi adalah " + inputMhs[index].nama);
            System.out.println("NIM : " + inputMhs[index].nim);
            System.out.println("Jenis Kelamin : " + inputMhs[index].jnsKelamin);
            System.out.println("Dengan Perolehan IPK " + inputMhs[index].ipk);
            System.out.println("================================");
        }
    
}
