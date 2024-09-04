import java.util.Scanner;

public class recursionIntro {

    static void printIncrease(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printIncrease(n-1);
        System.out.println(n);
    }
     
    static void printDecrease(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDecrease(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncrease(n);
        printDecrease(n);
    }
}
