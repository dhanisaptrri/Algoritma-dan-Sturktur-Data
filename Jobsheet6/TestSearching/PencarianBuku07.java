package TestSearching;

public class PencarianBuku07 {

    
    Buku07 listBK[] = new Buku07[5];
    int idx;

    void tambah(Buku07 m) {
        if (idx < listBK.length) {
            listBK[idx] = m;
            idx++;
        } else {
            System.out.println("DATA SUDAH PENUH!!!");
        }
    }

    void tampil() {
        for (Buku07 m : listBK) {
            m.tampilBuku();
        }
    }

    int findseqSearch(String cari) { 
        int posisi = -1;
        for (int j = 0; j < listBK.length; j++) {
            if (cari.equalsIgnoreCase(listBK[j].kodeBuku)) {
                j = posisi;
                break;
            }
        }
        return posisi;
    }

    Buku07 findbuku(String find) {
        int posisi = -1;
        for (int j = 0; j < listBK.length; j++) {
            if (find.equalsIgnoreCase(listBK[j].judulBuku)) {
                j = posisi;
                break;
            }
        }
        return listBK[posisi];
    }

    void printPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

}