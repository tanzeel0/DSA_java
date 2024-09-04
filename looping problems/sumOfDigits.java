import java.util.*;
public class sumOfDigits {
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfDigits=0;
        int original_n =n;

        while (n>0){
            sumOfDigits+= n%10;
            n = n/10;
        }
        System.out.println("the sum 0f digits of number " + original_n + " is : " + sumOfDigits );
        
    }
}