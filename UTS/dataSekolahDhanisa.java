import java.util.Scanner;

public class dataSekolahDhanisa {

    sekolahDhanisa listData[] = new sekolahDhanisa[6];
    int idx;
    Scanner sc = new Scanner(System.in);
        void tambahDhanisa(sekolahDhanisa m) {
            if (idx < listData.length) {
                listData[idx] = m;
                idx++;
            } else {
                System.out.println("DATA SUDAH PENUH!!!");
            }
        }
    
        void tampilDataDhanisa() {
            for (sekolahDhanisa sekolahDhanisa : listData) {
                if (sekolahDhanisa != null) {
                    sekolahDhanisa.tampilDataSekolahDhanisa();
                }
            }
        }
    
    
        int sequentialSearchDhanisa(String cariNama) {
            for (int i = 0; i < idx; i++) {
                if (listData[i].namaDhanisa.equals(cariNama)) {
                    return i;
                }
            }
            return -1;
        }
    
        void searchNamaSiswaDhanisa() {
            System.out.println("============================================");
            System.out.print("Masukkan Nama Siswa : ");
            String cariNama = sc.next();
            int index = sequentialSearchDhanisa(cariNama);
            if (index != -1) {
                System.out.println("--------------------------------------------");
                System.out.println("Data Siswa Ditemukan");
                System.out.println("NISN            : " + listData[index].nisnDhanisa);
                System.out.println("Nama            : " + listData[index].namaDhanisa);
                System.out.println("Tahun Masuk     : " + listData[index].tahunDhanisa);
                System.out.println("Alamat          : " + listData[index].alamatDhanisa);
            } else {
                System.out.println("Siswa dengan nama " + cariNama + " tidak ditemukan.");
            }
        }

        void selectionSortTahunTerlamaDhanisa() {
                for (int i = 0; i < idx - 1; i++) {
                    int maxIdx = i;
                    for (int j = i + 1; j < idx; j++) {
                        if (listData[j].tahunDhanisa > listData[maxIdx].tahunDhanisa) {
                            maxIdx = j;
                        }
                    }
                    sekolahDhanisa temp = listData[i];
                    listData[i] = listData[maxIdx];
                    listData[maxIdx] = temp;
                }
            }
}