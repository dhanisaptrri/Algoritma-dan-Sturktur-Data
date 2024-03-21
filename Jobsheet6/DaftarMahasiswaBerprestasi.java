public class DaftarMahasiswaBerprestasi {
    
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if(idx<listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("DATA SUDAH PENUH!!!!");
        } 
    }

    void tampil() {
        for(Mahasiswa  m : listMhs) {
            m.tampil();
            System.out.println("___________________");
        }
    }

    void bubbleShort() {
        for(int i = 0; i < listMhs.length; i++) {
            for(int j = 1; j < listMhs.length; j++) {
                if(listMhs[j].ipk > listMhs[j-1].ipk) {

                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
}
