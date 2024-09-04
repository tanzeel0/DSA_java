import java.util.Scanner;
public class alternativeSumSubSeries {
    static int sumSub(int n){
        if(n == 1) return n;

        if(n %2 == 0) return sumSub(n-1) - n;
        else return sumSub(n-1) + n;

    /*    int e = 0,o =0;
        if(n % 2 == 0) e = n;
        if(n%2 != 0) o = n;
        return sumSub(n-1) -e + o;*/
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumSub(n));
    }
}
