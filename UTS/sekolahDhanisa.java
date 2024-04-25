public class sekolahDhanisa {

    String nisnDhanisa;
    String namaDhanisa;
    String alamatDhanisa;
    int tahunDhanisa;
    double nilaiDhanisa;

    sekolahDhanisa(String nisnDhanisa, String namaDhanisa, String alamatDhanisa, int tahunDhanisa, double nilaiDhanisa) {
        this.nisnDhanisa = nisnDhanisa;
        this.namaDhanisa = namaDhanisa;
        this.alamatDhanisa = alamatDhanisa;
        this.tahunDhanisa = tahunDhanisa;
        this.nilaiDhanisa = nilaiDhanisa;
    }

    void tampilDataSekolahDhanisa() {

        System.out.println();
        System.out.println("NISN        : " + nisnDhanisa);
        System.out.println("Nama        : " + namaDhanisa);
        System.out.println("Alamat      : " + alamatDhanisa);
        System.out.println("Tahun       : " + tahunDhanisa);
        System.out.println("Nilai       : " + nilaiDhanisa);
    }
}