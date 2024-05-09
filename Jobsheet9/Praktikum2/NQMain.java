package Praktikum2;

public class NQMain {

    public static void main(String[] args) {
        
        Queue QNList = new Queue();

        QNList.enqueue("Anton", "111");
        QNList.enqueue("Prita", "112");
        QNList.enqueue("Yusuf", "113");
        QNList.enqueue("Doni", "114");
        QNList.enqueue("Sari", "115");

        QNList.displayQueue();

        QNList.dequeue();

        QNList.displayQueue();
    }
    
}
