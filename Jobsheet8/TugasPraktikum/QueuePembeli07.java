package TugasPraktikum;

import Praktikum2.Nasabah07;

public class QueuePembeli07 {

    Pembeli07[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public QueuePembeli07(int n) {
        max = n;
        antrian = new Pembeli07 [max];
        size = 0;
        front = rear =  -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear () {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue (Pembeli07 an) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian [rear] = an;
            size++;
        }
    }
    
    public Pembeli07 Dequeue() {
        Pembeli07 an= new Pembeli07(null, front);
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            an = antrian [front];
            size--;
            if (isEmpty()) { 
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return an;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].noHP + " ");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
            System.out.println(antrian[front].nama + " " + antrian[front].noHP + " "); 
            i = (i + 1) % max;
            }
        
            System.out.println(antrian[front].nama + " " + antrian[front].noHP + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public Pembeli07 peekRear() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue underflow! Program stopped.");
        } else {
            return antrian[rear];
        }
    }
    
    public void peekPosition(String nama) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        
        int currentPosition = front;
        int position = 1;
        boolean found = false;
    
        while (currentPosition != rear) {
            if (antrian[currentPosition].nama.equalsIgnoreCase(nama)) {
                System.out.println("Nama " + nama + " ditemukan pada posisi : " + position);
                found = true;
                break;
            }
            currentPosition = (currentPosition + 1) % max;
            position++;
        }

        if (!found && antrian[currentPosition].nama.equalsIgnoreCase(nama)) {
            System.out.println("Nama " + nama + " ditemukan pada posisi: " + position);
            found = true;
        }
    
        if (!found) {
            System.out.println("Nama " + nama + " tidak ditemukan dalam antrian");
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
    
        int currentPosition = front;
    
        System.out.println("Daftar Pembeli:");
        while (currentPosition != rear) {
            System.out.println(antrian[currentPosition].nama);
            currentPosition = (currentPosition + 1) % max;
        }
    
        System.out.println(antrian[currentPosition].nama);
    }
    
}
