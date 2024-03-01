package Praktikum1;

public class limasSegi4 {

    public int panjangSisi;
    public int tinggi;

    public limasSegi4(int r, int t) {

        panjangSisi = r;
        tinggi = t;

    }

    public double selimutLimas(){

        double s = Math.sqrt(panjangSisi * panjangSisi + tinggi * tinggi);
        return s;

    }

    public double volumeLinmas() {

        return (1.0 / 3.0 * ((panjangSisi * panjangSisi) * tinggi));

    }
    
    public int luasPermukaan() {

        return (panjangSisi * panjangSisi) + 4 * (panjangSisi * tinggi);

    }
}
