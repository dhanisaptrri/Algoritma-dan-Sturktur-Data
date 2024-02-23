public class BukuMain07 {
    
   public static void main(String [] args) {
        Buku07 bk1 = new Buku07();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1. pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 7100;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(6000);
        bk1.tampilInformasi();

        Buku07 bk2 = new Buku07("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku07 bukuShaca = new Buku07("Cara Menjadi Anak Baik", "Shasaca", 1000, 2, 5000000);
        bukuShaca.terjual(2);
        bukuShaca.tampilInformasi();
    }
}