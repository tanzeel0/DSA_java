public class isPoweof2 {
    public static void main(String[] args) {
        int n = 16;
        if((n & (n-1)) == 0) System.out.println("yes");
    }
}
