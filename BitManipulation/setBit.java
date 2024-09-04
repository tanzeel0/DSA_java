public class setBit {
    public static void main(String[] args) {
        int n = 9;
        int i=2;
        n = n |(1<<i);
        System.out.println(n);

        //clear bit
        int x = 13;
        int j = 2;
        x = x & ~(1 << j);
        System.out.println(x);
    }
}
