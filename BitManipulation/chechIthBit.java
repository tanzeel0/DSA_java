public class chechIthBit {
    public static void main(String[] args) {
        int n = 13;
        int i = 1;
        if((n & (1 << i)) != 0) System.out.println("set");
        else System.out.println("Not set");

        if((1 & (n >> i)) != 0) System.out.println("set");
        else System.out.println("not set");
    }
}
