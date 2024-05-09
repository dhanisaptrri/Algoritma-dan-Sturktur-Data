public class dataNode {
    String nama;
    String nim;
    dataNode next;

    dataNode(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.next = null;
    }
}