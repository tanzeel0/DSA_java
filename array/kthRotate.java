import java.util.*;
public class kthRotate {
    static int[] rotate(int arr[],int k){
        int n= arr.length;
        int ans [] = new int[n];
        int j=0;
        k = k%n;

        for(int i=n-k; i<n; i++){
            ans[j++] = arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void printArray(int[] ans){
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans [] = rotate(arr, k);
        printArray(ans);
        
    }
}