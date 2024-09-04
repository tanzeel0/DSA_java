import java.util.*;
public class reverseArray{
    static int[] reverseArr(int []arr){
        int n=arr.length;
        int []ans = new int[n];
        int i=n-1,j=0;
        while(i>=0){
            ans[j++] = arr[i--];
        }
        return ans;
    }
    static void printArray(int[] ans){
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans [] = reverseArr(arr);
        printArray(ans);
    }
}