import org.w3c.dom.Node;

public class DLL07 {

    Node07 head7;
    int size7;

    public DLL07() {
         
        head7 = null;
        size7 = 0;
    }

    public boolean isEmpty() {
        return head7 == null;
    }

    public void addFirst07(Pembeli07 pembeli07) {
        if (isEmpty()) {
            head7 = new Node07(null, pembeli07, null);
        } else {
            Node07 newNode7 = new Node07(null, pembeli07, head7);
            head7.prev7 = newNode7;
            head7 = newNode7;
        } 
        size7++;
    }
    
    public void addLast07(Pembeli07 pembeli07) {
        if (isEmpty()) {
            addFirst07(pembeli07);
        } else {
            Node07 current7 = head7;
            while (current7.next7 != null) {
                current7 = current7.next7;
            }
            
            Node07 newNode7 = new Node07(current7, pembeli07, null);
            current7.next7 = newNode7;
            size7++;
        }
    }

    public int size07() {
        return size7;
    }

    public void clear07() {
        head7 = null;
        size7 = 0;
    }

    public void print07() {
        if (!isEmpty()) {
            Node07 current = head7;
            System.out.println("| No.\t\t Nama Customer\t\t\t | No. HP");
            while (current != null) {
                System.out.println("| " + current.data7.noAntri7 + "\t\t " + current.data7.namaPembeli7 + "\t\t\t\t  " + current.data7.NoHp7);
                current = current.next7;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size7 == 1) {
            removeFirst();
        } else {
            head7 = head7.next7;
            head7.prev7 = null;
            size7--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus");
        } else if(head7.next7 == null) {
            head7 = null;
            size7--;
            return;
        }
        Node current7 = head7;
        while (current7.next7.next7 != null) {
            current7 = current7.next7;
        }
        current7.next7 = null;
        size7--;
    }


}
