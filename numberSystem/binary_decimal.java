import java.util.*;
public class binary_decimal {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int binarynum = sc.nextInt();

        int ans=0;
        int pw = 1;

        while(binarynum>0){
            int unitDigit = binarynum%10;
            ans+=(unitDigit * pw);
            binarynum/=10;
            pw*=2;
        }
        System.out.println(ans);
    }
}
