import java.util.*;
public class chekNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            System.out.print("enter the element to be searched:");
            int num = sc.nextInt();

            for(int j=0; j<n; j++){
                if(num == arr[j]){
                    System.out.println("yes");
                    n=0;
                }
            }
            
        }
    }
}
