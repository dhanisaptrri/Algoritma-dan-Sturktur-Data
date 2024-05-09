package Praktikum2;

public class Queue {

    private Node front; //Node awal
    private Node rear; // Node Akhir

    Queue() {
        this.front = null;
        this.rear = null;
    }

    boolean isEmpty() {
        return front == null;
    }

    void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        Node temp = front;
        System.out.println();
        System.out.println("Antrian Layanan Unit Kemahasiswaan :");
        while (temp != null) {
            System.out.println("Nama \t: " + temp.nama);
            System.out.println("NIM \t: " + temp.nim);
            System.out.println();
            temp = temp.next;
        }
    }

    void enqueue(String nama, String nim) {
        Node NQ = new Node(nama, nim);
        if (rear == null) {
            front = rear = NQ;
            return;
        }
        rear.next = NQ;
        rear = NQ;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dihapus.");
            return;
        }
        Node temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println("Nama \t: " + temp.nama);
        System.out.println("NIM \t: " + temp.nim);
        System.out.println();
    }
    
}
