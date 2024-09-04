import java.util.*;
public class inPrefixSum {

    static void prefsum(int arr[]){
        int n= arr.length;

        for(int i=1; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
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

        System.out.println("Input Array ");
        printArray(arr);

        System.out.println();

        System.out.println("prefix Sum ");
        prefsum(arr);
        printArray(arr);
    }
}
