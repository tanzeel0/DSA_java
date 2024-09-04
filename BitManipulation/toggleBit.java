public class toggleBit {
    public static void main(String[] args) {
        int n = 13;
        int i = 4;

        n = n ^ (1<<i);
        System.out.println(n);

        n = 13;
        i = 1;

        n = n ^ (1<<i);
        System.out.println(n);

        int k = 5;
        System.out.println((~k) ^ k);
    }
}
