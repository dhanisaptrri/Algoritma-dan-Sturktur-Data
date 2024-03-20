import java.net.Socket;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class mainShowroom07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Showroom07[] mobil = new Showroom07[8];

        mobil[0] = new Showroom07("BMW", "M2 Coupe", 2016, 6816, 728);
        mobil[1] = new Showroom07("Ford", "Fiesta ST", 2014, 3921, 575);
        mobil[2] = new Showroom07("Nissan", "370Z", 2009, 4360, 657);
        mobil[3] = new Showroom07("Subaru", "BRZ", 2014, 4058, 609);
        mobil[4] = new Showroom07("Subaru", "MImpreza WRX STI", 2013, 6255, 703);
        mobil[5] = new Showroom07("Toyota", "MAE86 Trueno", 1986, 3700, 553);
        mobil[6] = new Showroom07("Toyota", "86/GT86", 2014, 4180, 609);
        mobil[7] = new Showroom07("Volkswagen", "Golf GTI", 2014, 4180, 631);

        int indexHight = Showroom07.topAccTertinggi(mobil, 0, mobil.length - 1);
        int indexLow = Showroom07.topAccRendah(mobil, 0, mobil.length - 1);
        double rata2 = Showroom07.rata2Power(mobil);

       System.out.println("*************************DATA SHOWROOM**************************");
       System.out.println("----------------------------------------------------------------");
       System.out.println("Mobil Dengan Acceslaration Tertinggi Adalah : ");
       System.out.println("Merk             : " + mobil[indexHight].merk);
       System.out.println("Tipe             : " + mobil[indexHight].tipe);
       System.out.println("Tahun            : " + mobil[indexHight].tahun);
       System.out.println("Top Acceslation  : " + mobil[indexHight].topAcceslarition);
       System.out.println("Top Power        : " + mobil[indexHight].topPower);
       System.out.println("----------------------------------------------------------------");
       System.out.println("Mobil Dengan Acceslaration Terendah Adalah : ");
       System.out.println("Merk             : " + mobil[indexLow].merk);
       System.out.println("Tipe             : " + mobil[indexLow].tipe);
       System.out.println("Tahun            : " + mobil[indexLow].tahun);
       System.out.println("Top Acceslation  : " + mobil[indexLow].topAcceslarition);
       System.out.println("Top Power        : " + mobil[indexLow].topPower);
       System.out.println("----------------------------------------------------------------");
       System.out.println("Rata - Rata Top Power Dari Seluruh Mobil Di Showroom Adalah : " + rata2);
       System.out.println("********************************************************************");


    }
}
