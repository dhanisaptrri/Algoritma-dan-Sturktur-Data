package TestSearching;

public class PencarianBuku07 {

    
    Buku07 listBK[] = new Buku07[5];
    int idx;

    void tambah(Buku07 m) {
        if (idx < listBK.length) {
            listBK[idx] = m;
            idx++;
        } else {
            System.out.println("full");
        }
    }

    void tampil() {
        for (Buku07 m : listBK) {
            m.tampilBuku();
        }
    }

    int findseqSearch(String cari) { 
        int posisi = -1;
        for (int i = 0; i < listBK.length; i++) {
            if (cari.equalsIgnoreCase(listBK[i].kodeBuku)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    Buku07 findbuku(String cari) {
        int posisi = -1;
        for (int i = 0; i < listBK.length; i++) {
            if (cari.equalsIgnoreCase(listBK[i].judulBuku)) {
                posisi = i;
                break;
            }
        }
        return listBK[posisi];
    }

    void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos) {

        if (pos != -1) {
            System.out.println("Kode Buku       \t: " + x);
            System.out.println("Judul           \t: " + listBK[pos].judulBuku);
            System.out.println("Tahun Terbit    \t: " + listBK[pos].tahunTerbit);
            System.out.println("Pengarang       \t: " + listBK[pos].pengarang);
            System.out.println("Stock           \t: " + listBK[pos].stok);

        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public int FindBinarySearch(String cari, int l, int r) {
        int m;
        if (r >= l) {
            m = (l + r) / 2;
            if (cari.equalsIgnoreCase(listBK[m].kodeBuku)) {
                return m;
            } else if (cari.compareTo(listBK[m].kodeBuku) < 0) {
                return FindBinarySearch(cari, l, m - 1);
            } else {
                return FindBinarySearch(cari, m + 1, r);
            }
        }
        return -1;
    }

    public int binaryCariBuku(String cari, int l, int r) {
        int m;
        if (r >= l) {
            m = (l + r) / 2;
            if (cari.compareToIgnoreCase(listBK[m].judulBuku) == 0) {
                return m;
            } else if (cari.compareToIgnoreCase(listBK[m].judulBuku) < 0) {
                return binaryCariBuku(cari, l, m - 1);
            } else {
                return binaryCariBuku(cari, m + 1, r);
            }
        }
        return -1;
    }

    void StrInsertionSortAsc() {
        for (int i = 1; i < listBK.length; i++) {
            Buku07 temp = listBK[i];
            int j = i;
            while (j > 0 && listBK[j - 1].kodeBuku.compareTo(temp.kodeBuku) > 0) {
                listBK[j] = listBK[j - 1];
                j--;
            }
            listBK[j] = temp;
        }
    }

    void binaryCariJudul() {
        for (int i = 1; i < listBK.length; i++) {
            Buku07 temp = listBK[i];
            int j = i;
            while (j > 0 && listBK[j - 1].judulBuku.compareTo(temp.judulBuku) > 0) {
                listBK[j] = listBK[j - 1];
                j--;
            }
            listBK[j] = temp;
        }
    }

    public int judulSama(String cari) {
        int hitung = 0;
        for (int i = 0; i < listBK.length; i++) {
            if (listBK[i].judulBuku != null && listBK[i].judulBuku.equalsIgnoreCase(cari)) {
                hitung++;
            }
        }
        return hitung;
    }

    
}