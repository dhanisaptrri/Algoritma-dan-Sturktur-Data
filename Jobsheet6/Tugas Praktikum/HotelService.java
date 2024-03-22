public class HotelService {

    Hotel[] rooms = new Hotel[5];
    int kmr;

    void tambah(Hotel htl) {
        if(kmr < rooms.length) {
            rooms[kmr] = htl;
            kmr++;
        } else {
            System.out.println("FULL BOKING HOTEL");
        }
    }

    void tampil() {
        for (Hotel htl : rooms) {
            htl.tambah();
            System.out.println("------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].harga < rooms[j-1].harga) {
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for(int i = 0; i < rooms.length - 1; i++) {
            int bnt = i;
            for(int j = i + 1; j < rooms.length; j++) {
                if(rooms[j].bintang > rooms[bnt].bintang) {
                    bnt = j;
                }
            }

            Hotel tmpt = rooms[bnt];
            rooms[bnt] = rooms[i];
            rooms[i] = tmpt;
        }
    }

}