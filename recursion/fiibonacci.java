import java.util.Scanner;
public class fiibonacci {
    static int fib(int n){
        //base case
        if(n == 0 || n==1 ) return n;
        //recursion
        
        //self
        return fib(n-1) + fib(n-2);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(fib(i));
        }
        
    }
}
