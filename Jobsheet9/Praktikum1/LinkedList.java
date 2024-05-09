public class LinkedList {
    
    dataNode head;

    boolean isEmpty() {
        return head!= null;
    }

     void print() {
        if (isEmpty()) {
            dataNode tmp = head;
            System.out.println();
            System.out.print("Isi Linked List : ");
            System.out.println();
            while (tmp != null) {
                System.out.println();
                System.out.println("Nama \t: " + tmp.nama);
                System.out.println("NIM \t: " + tmp.nim);
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println();
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(String nama, String nim) {
        dataNode newDN = new dataNode(nama, nim);
        if (isEmpty()) {
            newDN.next = head;
            head = newDN;
        } else {
            head = newDN;
        }
    }

    void addLast(String nama, String nim) {
        dataNode newDN = new dataNode(nama, nim);
        if (head == null) {
            head = newDN;
            return;
        }
        dataNode last = head;
        while (last.next != null) {
            last = last.next;
        }
    }

    void insertAfter(dataNode prevNode, String nama, String nim) {
        if (prevNode == null) {
            System.out.println("Node sebelumnya tidak boleh null");
            return;
        }
        dataNode newNode = new dataNode(nama, nim);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    void insertAt(int index, String nama, String nim) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
        if (index == 0) {
            addFirst(nama, nim);
            return;
        }
        dataNode newNode = new dataNode(nama, nim);
        dataNode current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                System.out.println("Indeks melebihi panjang linked list");
                return;
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

}
