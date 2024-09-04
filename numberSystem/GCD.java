public class GCD {
    public static void main(String[] args) {
        int x = 12, y = 16;
        while(x%y != 0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        System.out.println(y);
    }
}
