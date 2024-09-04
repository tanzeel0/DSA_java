import java.util.*;
public class sortedArray2 {

    static void printArray(int arr[]){
        int n= arr.length;

        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
    }

    static void reverse(int arr[]){
        int n = arr.length;
        int i=n-1,j=0;
        int ans [] = new int[n];

        while(i>=0){
            ans[j++] = arr[i--];
        }
    }

    static int[] sortSquare(int arr[]){
        int n = arr.length;
        int left=0, right=n-1,k=0;
        int ans [] = new int[n];

        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
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
        int ans[] = sortSquare(arr);
        reverse(ans);
        printArray(ans);
    }
}
