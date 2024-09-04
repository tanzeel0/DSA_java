public class sumDigits{
    static int sum(int n){
        if(n >= 0 && n <= 9) return n;
       // int f = sum(n/10);

       // int l = n%10;
       // return l+f;
        return (n%10) + sum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sum(52134));
    }
}