package Praktikum1;
public class Queue07 {

    int[] data;
    int fornt;
    int rear;
    int size;
    int max;

    public Queue07(int n) {
        max = n;
        data = new int[max];
        size = 0;
        fornt = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + data[fornt]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void print() {
        if (!isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = fornt;
            while ( (i != rear)) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear () {
        if (!isEmpty()) {
            fornt = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue (int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                fornt= rear = 0;
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

    public int Dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data [fornt];
            size--;
            if (isEmpty()) { fornt = rear = -1;
            } else {
                if (fornt == max - 1) {
                    fornt = 0;
                } else {
                    fornt++;
                }
            }
        }
        return dt;
    }


}
