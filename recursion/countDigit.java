public class countDigit {
    static int c = 0;
    static int count(int n){
        if(n > 0) {
            c++;
            count(n/10);
        } return c;
    }
    public static void main(String[] args) {
       System.out.println(count(5683));
    }
}
 