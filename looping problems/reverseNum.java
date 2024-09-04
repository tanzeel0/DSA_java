import java.util.*;
public class reverseNum {
    public static void main(String args [] ){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int original_n = n;
        int  ans=0;

        while(n>0){
            ans = ans *10 + n%10;
            n=n/10;

        }
        System.out.println("rever num of " + original_n + " is: "+ ans);
    }
}
