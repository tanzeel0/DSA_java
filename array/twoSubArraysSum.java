import java.util.*;
public class twoSubArraysSum {

   /*  static int[] prefSum(int arr[]){
        int n= arr.length;
        for(int i=1; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    } */

    static int totalsum(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        return sum;
    }

    static boolean equalSum(int arr[]){
        int sum = totalsum(arr);
        int n = arr.length;
        int prefSum = 0;
        for(int i=0; i<n; i++){
            prefSum += arr[i];
            int suffixSum = sum - prefSum;
            if(suffixSum == prefSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(equalSum(arr));
    }
}
