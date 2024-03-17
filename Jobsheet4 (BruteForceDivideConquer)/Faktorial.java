public class Faktorial {

    public int nilai;

    int faktorialBf(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }

        return fakto;
    }

    int fakorialDC(int n) {
        if(n==1) {
            return 1;
        }
        else{
            int fakto = n * fakorialDC(n-1);
            return fakto;
        }
    }
}