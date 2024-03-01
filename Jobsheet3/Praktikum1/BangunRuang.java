package Praktikum1;

import java.util.Scanner;

public class BangunRuang {
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("*****Pilih Bangun Ruang Untuk Dihitung *****");
        System.out.println();
        System.out.println("1. Kerucut");
        System.out.println("2. Limas Segi Empat");
        System.out.println("3. Bola");
        System.out.println("4. Keluar Program");
        System.out.print("Masukan Pilihan Angka untuk Menghitung Bangung Ruang : ");
        int hitung = sc.nextInt();
        clearScreen();

        switch (hitung) {
            case 1:


                    System.out.println("*****Menghitung Kerucut*****");
                    System.out.println();
                    System.out.println("1. Menghitung Luas Permukaan");
                    System.out.println("2. Menghitung Volume");
                    System.out.print("Pilih yang ingi dihitung : ");
                    int pilihKer = sc.nextInt();
                    clearScreen();

                switch (pilihKer) {
                    case 1:
                        
                        Kerucut[] brKerucut1 = new Kerucut[1];

                        for ( int i =0; i < brKerucut1.length; i++){
                        
                            System.out.println("*****Menghitung Luas Permukaan Kerucut*****");
                            System.out.println();
                            System.out.print("Masukan jari - jari : ");
                            int r = sc.nextInt();
                            System.out.print("Masukan Sisi Miring : ");
                            int s = sc.nextInt();
                            brKerucut1[i] = new Kerucut(r, s); 
                        }
                 
                        for ( int i = 0; i < brKerucut1.length; i++){
                        System.out.println("Hasil dari Penghitungan Luas Permukaan Kerucut : " + brKerucut1[i].luasPermukaan());

                        }
                        break;

                        case 2:
                            Kerucut[] brKerucut2 = new Kerucut[1];

                            for ( int i =0; i < brKerucut2.length; i++){
                        
                                System.out.println("*****Menghitung Volume Kerucut*****");
                                System.out.println();
                                System.out.print("Masukan jari - jari : ");
                                int r = sc.nextInt();
                                System.out.print("Masukan Sisi Miring : ");
                                int s = sc.nextInt();
                                brKerucut2[i] = new Kerucut(r, s); 
                            }
                 
                            for ( int i = 0; i < brKerucut2.length; i++){
                                System.out.println("Hasil dari Penghitungan Volume Kerucut : " + brKerucut2[i].volume());
                            }
                            
                        }
                        break;
                
                
                case 2 :

                    System.out.println("*****Menghitung Limas*****");
                    System.out.println();
                    System.out.println("1. Menghitung Luas Permukaan");
                    System.out.println("2. Menghitung Volume");
                    System.out.print("Pilih yang ingi dihitung : ");
                    int pilihLimas = sc.nextInt();
                    clearScreen();

                    switch (pilihLimas) {
                        case  1:

                            limasSegi4 [] brLimas1 = new limasSegi4[1];
                            for( int i = 0; i < brLimas1.length; i++) {
                                
                                System.out.println("*****Menghitung Luas Permukaan Limas Segiempat*****");
                                System.out.println();
                                System.out.print("Masukan Panjang Sisi : ");
                                int r = sc.nextInt();
                                System.out.print("Masukan Tinggi : ");
                                int t = sc.nextInt();
                                brLimas1[i] = new limasSegi4(r, t);
                            }

                            for(int i = 0; i <brLimas1.length; i++){

                                System.out.println("Hasil dari Penghitungan Luas Permukaan Limas Segiempat : " + brLimas1[i].luasPermukaan());
                            }
                            break;
                    
                        case 2:

                            limasSegi4 [] brLimas2 = new limasSegi4[1];
                            for( int i = 0; i < brLimas2.length; i++) {
                                
                                System.out.println("*****Menghitung Volume Limas Segiempat*****");
                                System.out.println();
                                System.out.print("Masukan Panjang Sisi : ");
                                int r = sc.nextInt();
                                System.out.print("Masukan Tinggi : ");
                                int t = sc.nextInt();
                                brLimas2[i] = new limasSegi4(r, t);
            
                            }

                            for(int i = 0; i <brLimas2.length; i++){

                            System.out.println("Hasil dari Penghitungan Volume Limas Segiempat : " + brLimas2[i].volumeLinmas());
                        }
                        break;
                    }

                case 3:
                    
                    System.out.println("*****Menghitung Bola*****");
                    System.out.println();
                    System.out.println("1. Menghitung Luas Permukaan");
                    System.out.println("2. Menghitung Volume");
                    System.out.print("Pilih yang ingin dihitung : ");
                    int pilihBola = sc.nextInt();
                    clearScreen();

                    switch (pilihBola) {
                        case 1:
                            
                            BolaBsr[] brBola1 = new BolaBsr[1];
                            for( int i = 0; i < brBola1.length; i++) {

                                brBola1[i] = new BolaBsr();
                            
                                System.out.println("*****Menghitung Luas Permukaan Bola*****");
                                System.out.println();
                                System.out.print("Masukan Jari - Jari : ");
                                brBola1[i].r = sc.nextInt();
                            }

                            for(int i = 0; i <brBola1.length; i++){

                                System.out.println("Hasil dari Penghitungan Luas Permukaan Bola : " + brBola1[i].luasPermukaan());
                            }
                            break;

                        case 2:

                            BolaBsr[] brBola2 = new BolaBsr[1];
                            for( int i = 0; i < brBola2.length; i++) {
                                brBola2[i] = new BolaBsr();
                                
                                System.out.println("*****Menghitung Luas Permukaan Bola*****");
                                System.out.println();
                                System.out.print("Masukan Jari - Jari : ");
                                brBola2[i].r = sc.nextInt();
                            }

                            for(int i = 0; i <brBola2.length; i++){

                            System.out.println("Hasil dari Penghitungan Luas Permukaan Bola : " + brBola2[i].volume());
                            }
                            break;
                    }
            }
    }
}  
