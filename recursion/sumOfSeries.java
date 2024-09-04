public class sumOfSeries {
    static int ksum(int n){
        if(n == 1) return n;
        return ksum(n-1) + n;
    }
    public static void main(String[] args) {
        System.out.println(ksum(5));
    }
}