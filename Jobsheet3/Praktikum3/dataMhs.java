package Praktikum3;

import java.util.Scanner;

import Praktikum2.inputDataMhs;

public class dataMhs {

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cariData[] inputData = new cariData[3];

        for(int i = 0; i < inputData.length; i++){
            inputData[i] = new cariData();
            System.out.println("Masukan Data Mahasiswa ke-" + (i + 1));

            System.out.print("Masukan Nama Mahasiswa : ");
            inputData[i].nama = sc.next();

            System.out.print("Masukan NIM : ");
            inputData[i].nim = sc.nextInt();
            
            System.out.print("Masukan Jenis Kelamin : ");
            inputData[i].jnsKelamin = sc.next();

            System.out.print("Masukan IPK : ");
            inputData[i].ipk = sc.nextDouble();

        }

        for(int i = 0; i < inputData.length; i++){
            System.out.println("Data Mahasiswa ke-" + (i+1) );
            System.out.println("Nama            : " + inputData[i].nama);
            System.out.println("Nim             : " + inputData[i].nim);
            System.out.println("Jenis Kelamin   : " + inputData[i].jnsKelamin);
            System.out.println("IPK             : " +inputData[i].ipk);
        }

        inputData[0].mencariRata2(inputData);
        inputData[0].nilaiTinggi(inputData);

    }
    
}

