import java.util.*;
public class suffixsumArray {

    static int[] suffSum(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        ans[n-1] = arr[n-1];

        for(int i=n-2; i>=0; i--){
            ans[i] = ans[i+1] + arr[i];
        }
        return ans;
    }
    
    static int[] reverseArr(int []arr){
        int n=arr.length;
        int []ans = new int[n];
        int i=n-1,j=0;
        while(i>=0){
            ans[j++] = arr[i--];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans[] = suffSum(arr);
        int sufans[] = reverseArr(ans);


        for(int i=0; i<n; i++){
            System.out.println(sufans[i] + " ");
        }
    }
}
