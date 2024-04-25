package MargeSortTest;

import java.util.Scanner;

public class MergeSortMain07 {
    
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);



        int data[] = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan Merge Sort");
        
        MergerSorting07 mSort = new MergerSorting07();
        
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.mergeSort(data);

        System.out.println("Setelag Diurutkan");
        mSort.printArray(data);
    }
}
