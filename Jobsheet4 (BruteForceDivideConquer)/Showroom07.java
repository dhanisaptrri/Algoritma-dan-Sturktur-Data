import java.util.Arrays;

public class Showroom07 {

    String merk;
    String tipe;
    int tahun;
    int topAcceslarition;
    int topPower;

    public Showroom07(String merk, String tipe, int tahun, int topAcceslarition, int topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceslarition = topAcceslarition;
        this.topPower = topPower;
    }

    public int topAcc() {
        return topAcceslarition;
    }

    public static int topAccTertinggi(Showroom07[] showroom, int low, int hight) {
        if (low == hight) {
            return low;
        }
        int mid = low + (hight - low) / 2;

        int batasHight = topAccTertinggi(showroom, mid + 1, hight);
        int batasLow = mid;

        if (showroom[batasHight].topAcc() > showroom[batasLow].topAcc()) {
            batasLow = batasHight;
        }

        batasHight = topAccTertinggi(showroom, low, mid);

        if (showroom[batasHight].topAcc() > showroom[batasLow].topAcc()) {
            batasLow = batasHight;
        }
        return batasLow;
    }

    public static int topAccRendah(Showroom07[] showroom, int low, int hight) {
        if (low == hight) {
            return low;
        }

        int mid = low + (hight - low) / 2;

        int batasHight = topAccRendah(showroom, mid + 1, hight);
        int batasLow = mid;

        if (showroom[batasHight].topAcc() < showroom[batasLow].topAcc()) {
            batasLow = batasHight;
        }
        batasHight = topAccRendah(showroom, low, mid);

        if (showroom[batasHight].topAcc() < showroom[batasLow].topAcc()) {
            batasLow = batasHight;
        }

        return batasLow;
    }

    public static double rata2Power(Showroom07[] showroom) {
        double totalPower = 0;
        int totalMobil = 0;
        for (Showroom07 showrooms : showroom) {
            totalPower += showrooms.topAcc();
            totalMobil++;
        }
        return totalPower / totalMobil;
    }
}