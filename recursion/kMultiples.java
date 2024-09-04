import java.util.Scanner;
public class kMultiples {
    static void mulK(int n,int k){
        if(k == 0)  return;
        
        mulK(n, k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        mulK(n, k);
    }
}