public class Faktorial {

    public int nilai;

    int faktorialBf(int n) {
        int fakto = 1;
        for(int i = 1; i <= n; i++) {
            fakto = fakto * i;
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