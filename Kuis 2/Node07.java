public class Node07 {

    Pembeli07 data7;
    Pesanan07 list7;
    Node07 prev7;
    Node07 next7;

    public Node07(Node07 prev7, Pembeli07 data7, Node07 next7) {

        this.data7 = data7;
        this.prev7 = prev7;
        this.next7 = next7;
    }

    public Node07 (Pesanan07 list07) {

        this.list7 = list07;
        this.prev7 = null;
        this.next7 = null;
    }
    
}
