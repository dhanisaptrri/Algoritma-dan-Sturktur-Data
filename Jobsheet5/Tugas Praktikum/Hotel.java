public class Hotel {

    String nama;
    String kota;
    int harga;
    Byte bintang;

    Hotel(String n, String k, int h, Byte b) {

        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tambah() {

        System.out.println("Hotel " + nama);
        System.out.println("Kota " + kota);
        System.out.println("Harga Rp." + harga);
        System.out.println("Rating Bintang" + bintang);
    }
}