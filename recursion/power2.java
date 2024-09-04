public class power2 {
    static int calcpower(int p,int q){
        if(q == 0) return 1;
        int smallpow = calcpower(p, q/2);
        if(q%2 == 0){
            return smallpow * smallpow;
        }else
            return p * smallpow * smallpow;
    }
    public static void main(String[] args) {
        System.out.println(calcpower(4, 3));
    }
}
