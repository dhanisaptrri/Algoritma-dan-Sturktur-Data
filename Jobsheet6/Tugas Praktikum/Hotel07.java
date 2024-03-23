public class Hotel07 {

    String nama;
    String kota;
    int harga;
    double bintang;


    Hotel07(String n, String k, int h, double b) {

        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampil() {

        System.out.println("HOTEL " + nama);
        System.out.println("Kota " + kota);
        System.out.println(" Harga : " + harga);
        System.out.println("Ranting Bintang     " + bintang);
    }
}
