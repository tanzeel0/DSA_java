import java.util.*;
public class prefixSum {

    static int[] prefsum(int arr[]){
        int n= arr.length;
        int [] pref = new int[n];
        pref[0] = arr[0];
        for(int i=1;i<n;i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

    static void printArray(int arr[]){
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int arr1 []= prefsum(arr);
        printArray(arr1);
    }
}
