package Praktikum1;

public class Kerucut {

    public int jari2;
    public int sisiMiring;
    public double phi = 3.14;

    public Kerucut(int r, int s){
        jari2 = r;
        sisiMiring = s;
    }

    public double luasPermukaan() {

        return phi * jari2 * (jari2 + sisiMiring);

    }

    public double volume() {

        return phi * jari2 * jari2 *((int)Math.sqrt((sisiMiring * sisiMiring) + (jari2 * jari2))) / 3;
    }
    
}
