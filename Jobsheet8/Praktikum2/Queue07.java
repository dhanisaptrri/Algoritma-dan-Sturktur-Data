package Praktikum2;

public class Queue07 {

    Nasabah07[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue07(int n) {
        max = n;
        data = new Nasabah07 [max];
        size = 0;
        front = rear =  -1;
    }

    public void Enqueue (Nasabah07 dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data [rear] = dt;
            size++;
        }
    }
    
    public Nasabah07 Dequeue() {
        Nasabah07 dt = new Nasabah07(null, null, null, max, front);
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data [front];
            size--;
            if (IsEmpty()) { 
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data [front].norek + " " + data [front].nama + " " + data[front].alamat + " " + data [front].umur + " " + data [front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i!= rear) {
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + + data[i].saldo); 
            i =(1+1) % max;
            }
        
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }
    
}
