public class power {
    static int calcPower(int p,int q){
        if(q == 0) return 1;
        return calcPower(p, q-1) * p;
    }
    public static void main(String[] args) {
        System.out.println(calcPower(3, 4));
    }
}
