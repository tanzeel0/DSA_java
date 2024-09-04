import java.util.Scanner;
public class decimal_binary{
    public static void main(String args[]){
     
        Scanner sc = new Scanner(System.in);
        int decimalNum = sc.nextInt();
        int ans=0;
        int pw=1;

        while(decimalNum > 0){
        int parity = decimalNum % 2;

        ans += (parity * pw);
        pw*=10;
        decimalNum /=2;
     }
        System.out.println(ans);
    }
}
