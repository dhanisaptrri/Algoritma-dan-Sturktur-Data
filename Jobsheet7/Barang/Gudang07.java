public class Gudang07 {

    Barang07[] tumpukan;
    int size;
    int top;

    public Gudang07(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang07[size];
        top = -1;
    }

    public boolean cekKosong() {
        if ( top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if ( top == size -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public void tambahBarang(Barang07 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
        }else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang07 ambilBarang07() {
        if (!cekKosong()) {
            Barang07 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner : " + koncersiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang07 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang07 barangteratas = tumpukan[top];
            System.out.println("Barang teratas : " + barangteratas.nama);
            return barangteratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang : ");
            for (int i = top; i >= 0; i--){
            //for(int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String koncersiDesimalKeBiner(int kode) {
        StackKonversi stack = new StackKonversi();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode /2;
        }

        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public Barang07 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang07 barangterbawah = tumpukan[0];
            System.out.println("Barang terbawah : " + barangterbawah.nama);
            return barangterbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang07 cariBarang(String kodeBarang) {
        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].kode == Integer.parseInt(kodeBarang)) {
                return tumpukan[i];
            }
            if (tumpukan[i].nama.equals(kodeBarang)) {
                return tumpukan[i];
            }
        }
        return null;
    }
}
