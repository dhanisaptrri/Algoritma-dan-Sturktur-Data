public class DoubleLinkedList07 {

    Node07 head;
    int size;
    
    public DoubleLinkedList07() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node07(null, item, jarak, null);
        } else {
            Node07 newNode07 = new Node07(null, item, jarak, head);
            head.prev = newNode07;
            head = newNode07;
        }
        size++;
    }
        
    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node07 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
    
    public void remove(int index) {
        Node07 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }
        
    public void clear() {
        head = null;
        size = 0;
    }
        
    public int size() {
        return size;
    }
        
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node07 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}