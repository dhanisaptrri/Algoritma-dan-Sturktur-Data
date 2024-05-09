public class LLMain {
    
    public static void main(String[] args) {
        LinkedList dataList = new LinkedList();

        dataList.addLast("Sari", "115");
        dataList.addFirst("Anton", "111");
        dataList.insertAfter(dataList.head, "Prita", "112");
        dataList.insertAt(2, "Yusuf", "113"); 
        dataList.insertAt(3, "Doni", "114");
        dataList.print();
    }
}