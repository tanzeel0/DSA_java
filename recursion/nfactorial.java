import java.util.Scanner;
public class nfactorial{

    static int fact(int n){
        //base case
        if(n == 1) return 1;
        return fact(n-1)* n;
       //sub problem
     //   int sans = fact(n-1);
        //self work
     //   int ans = n * sans;
     //   return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
}