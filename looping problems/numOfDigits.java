import java.util.Scanner;
public class numOfDigits {
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int numOfDigits=0;
        int originalNum = n;

        while(n > 0){
            n =n/10;
        numOfDigits++;
        }
        System.out.println("the num of digits of " + originalNum + " is : " + numOfDigits);
    }
}
