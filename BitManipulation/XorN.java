public class XorN {
    public static void main(String[] args) {

        //from 1 to n xor operations
        int n = 16;
        System.out.println(xorTillNumber(n));

        //from L to R xor operations
        int l = 4;
        int r = 14;
        int lxor = xorTillNumber(l-1);
        int rxor = xorTillNumber(r);
        System.out.println(lxor ^ rxor);

    }

    static int xorTillNumber(int n){
        if(n%4 == 1) return 1;
        if(n%4 == 2) return n+1;
        if(n%4 == 3) return 0;
        return n;
    }
}
